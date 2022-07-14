package jm.plugins.demo.service.impl;

import jm.dict.plugin.entity.JDictString;
import jm.plugins.demo.entity.DictData;
import jm.plugins.demo.mapper.DictDataMapper;
import jm.plugins.demo.service.IDictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: DictDataServiceImpl</p>
 * <p>描述: [字典数据Service]</p>
 * <p>创建时间: 2022/6/5 20:11</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/6/5 20:11] [Chen Yujie][init]
 */
@Service
public class DictDataServiceImpl implements IDictDataService {
    @Autowired
    private DictDataMapper dictDataMapper;

    @Override
    public List<JDictString> listDictDataByType(List<String> types) {
        if (ObjectUtils.isEmpty(types)) {
            return null;
        }
        List<DictData> dictDataList = dictDataMapper.listDictDataByType(types);
        List<JDictString> jDictStrings = new ArrayList<>();
        dictDataList.forEach(item -> {
            JDictString jDict = new JDictString();
            jDict.setType(item.getDictType());
            jDict.setValue(item.getDictValue());
            jDict.setLabel(item.getDictLabel());
            jDictStrings.add(jDict);
        });

        return jDictStrings;
    }
}
