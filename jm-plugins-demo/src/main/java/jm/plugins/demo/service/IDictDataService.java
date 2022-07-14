package jm.plugins.demo.service;

import jm.dict.plugin.entity.JDictString;

import java.util.List;

public interface IDictDataService {

    /**
     * @Description: [根据type获取字典数据]
     * @param: types
     * @return: List
     * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
     * @update: [1][2022-06-05 20:13] [Chen Yujie][init]
     */
    List<JDictString> listDictDataByType(List<String> types);
}
