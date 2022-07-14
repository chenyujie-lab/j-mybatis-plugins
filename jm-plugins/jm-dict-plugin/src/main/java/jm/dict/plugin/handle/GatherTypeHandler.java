package jm.dict.plugin.handle;

import jm.dict.plugin.annotation.JDictField;
import jm.dict.plugin.annotation.JIncludeDict;
import jm.dict.plugin.entity.JMappingObject;
import jm.dict.plugin.utils.DefaultMetaObject;
import jm.plugins.constants.StringConstant;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: GatherTypeHandler</p>
 * <p>描述: [字典类型收集处理器]</p>
 * <p>创建时间: 2022/7/2 22:21</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/2 22:21] [Chen Yujie][init]
 */
public class GatherTypeHandler extends AbstractDictDataHandler {
    private Logger log = LoggerFactory.getLogger(GatherTypeHandler.class);

    private HashSet<String> dictTypeSet = new HashSet<>();

    @Override
    public void doHandle(JMappingObject object) throws Exception {
        log.info("execute GatherTypeHandler.doHandle()");

        this.objectHandle(object.getResult());
        List<String> typeList = new ArrayList<>(this.dictTypeSet);
        object.setTypeList(typeList);
        if (super.nextHandelr != null) {
            super.nextHandelr.doHandle(object);
        }
    }

    private void objectHandle(Object result) {
        if (ObjectUtils.isEmpty(result)) {
            return;
        }
        if (result instanceof List) {
            List<Object> objectList = (List<Object>) result;
            if (objectList != null && objectList.size() > 0) {
                JIncludeDict includeDict = objectList.get(0).getClass().getAnnotation(JIncludeDict.class);
                if (null == includeDict) {
                    return;
                }
                for (Object o : objectList) {
                    this.objectHandle(o);
                }
            }
            return;
        }

        JIncludeDict includeDict = result.getClass().getAnnotation(JIncludeDict.class);
        if (null ==  includeDict) {
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
                this.objectHandle(value);
                continue;
            }
            JDictField annotation = field.getAnnotation(JDictField.class);
            if (null == annotation) {
                continue;
            }
            if (StringUtils.isEmpty(annotation.type())) {
                continue;
            }
            this.dictTypeSet.add(annotation.type());
            field.setAccessible(true);
            String name = field.getName();
            metaObject.setValue(name + StringConstant.DOT + "type", annotation.type());
        }
    }
}
