package jm.dict.plugin.handle;

import jm.dict.plugin.annotation.JDictField;
import jm.dict.plugin.annotation.JIncludeDict;
import jm.dict.plugin.entity.JDictBase;
import jm.dict.plugin.entity.JMappingObject;
import jm.dict.plugin.error.JDictError;
import jm.dict.plugin.utils.DefaultMetaObject;
import jm.plugins.constants.StringConstant;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: DataMappingHandler</p>
 * <p>描述: [数据映射处理器]</p>
 * <p>创建时间: 2022/7/2 22:51</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/2 22:51] [Chen Yujie][init]
 */
public class DataMappingHandler extends AbstractDictDataHandler {
    private Logger log = LoggerFactory.getLogger(DataMappingHandler.class);

    @Override
    public void doHandle(JMappingObject object) throws Exception {
        log.info("execute DataMappingHandler.doHandle()");
        Object result = object.getResult();
        List<JDictBase<Object>> dataList = object.getDictDataList();
        if (!ObjectUtils.isEmpty(dataList)) {
            this.processMapping(result, dataList);
        }
    }

    private void processMapping(Object result, List<JDictBase<Object>> dictDataList) {

        if (ObjectUtils.isEmpty(result)) {
            return;
        }

        if (result instanceof List) {
            List<Object> objectList = (List<Object>) result;
            for (Object o : objectList) {
                this.processMapping(o, dictDataList);
            }
            return;
        }

        JIncludeDict includeDict = result.getClass().getAnnotation(JIncludeDict.class);
        if (null == includeDict) {
            return;
        }

        MetaObject metaObject = DefaultMetaObject.instance().newMetaObject(result);
        Field[] declaredFields = result.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getType() == List.class) {
                Object value = metaObject.getValue(field.getName());
                if (ObjectUtils.isEmpty(value)) {
                    continue;
                }
                this.processMapping(value, dictDataList);
                continue;
            }
            JDictField annotation = field.getAnnotation(JDictField.class);
            if (null == annotation) {
                continue;
            }

            String type = annotation.type();

            field.setAccessible(true);
            Object value = null;
            try {
                Object o = field.get(result);
                if (o instanceof JDictBase) {
                    JDictBase<Object> dictObject = (JDictBase<Object>) o;
                    value = dictObject.getValue();
                    if (null == value) {
                        continue;
                    }
                }
            } catch (IllegalAccessException e) {
                log.error(JDictError.REFLECT_ILLEGAL_ACCESS.getMessage(), e.getMessage());
                continue;
            }
            Object finalValue = value;
            List<JDictBase<Object>> dictList = dictDataList.stream().filter(item ->
                        type.equals(item.getType()) && finalValue.equals(item.getValue()))
                    .collect(Collectors.toList());
            if (ObjectUtils.isEmpty(dictList)) {
                continue;
            }
            String name = field.getName();
            metaObject.setValue(name + StringConstant.DOT + "label", dictList.get(0).getLabel());
        }
    }
}
