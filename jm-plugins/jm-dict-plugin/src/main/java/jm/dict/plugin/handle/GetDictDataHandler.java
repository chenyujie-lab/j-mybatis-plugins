package jm.dict.plugin.handle;

import jm.dict.plugin.entity.JDictBase;
import jm.dict.plugin.entity.JMappingObject;
import jm.dict.plugin.functional.JDictDataInputSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: GetDictDataHandler</p>
 * <p>描述: [获取字典数据处理器]</p>
 * <p>创建时间: 2022/7/2 22:28</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/2 22:28] [Chen Yujie][init]
 */
public class GetDictDataHandler extends AbstractDictDataHandler {
    private Logger log = LoggerFactory.getLogger(GetDictDataHandler.class);

    @Override
    public void doHandle(JMappingObject object) throws Exception {
        log.info("execute GetDictDataHandler.doHandle()");
        JDictDataInputSource dictDataInputSource = object.getDictDataInputSource();
        if (null == dictDataInputSource) {
            return;
        }
        if (ObjectUtils.isEmpty(object.getTypeList())) {
            log.info("dictionary data exists but no dictionary type was found.");
            return;
        }
        List<JDictBase<Object>> dictDataList = dictDataInputSource.doQuery(object.getTypeList());
        object.setDictDataList(dictDataList);
        if (super.nextHandelr != null) {
            super.nextHandelr.doHandle(object);
        }
    }
}
