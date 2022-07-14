package jm.dict.plugin.entity;

import jm.dict.plugin.functional.JDictDataInputSource;

import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: JMappingObject</p>
 * <p>描述: [类型描述]</p>
 * <p>创建时间: 2022/7/2 22:41</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/7/2 22:41] [Chen Yujie][init]
 */
public class JMappingObject {

    private List<String> typeList;

    private JDictDataInputSource dictDataInputSource;

    private List<JDictBase<Object>> dictDataList;

    private Object result;



    public JMappingObject(Object result, JDictDataInputSource dictDataInputSource) {
        this.result = result;
        this.dictDataInputSource = dictDataInputSource;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public JDictDataInputSource getDictDataInputSource() {
        return dictDataInputSource;
    }

    public void setDictDataInputSource(JDictDataInputSource dictDataInputSource) {
        this.dictDataInputSource = dictDataInputSource;
    }

    public List<JDictBase<Object>> getDictDataList() {
        return dictDataList;
    }

    public void setDictDataList(List<JDictBase<Object>> dictDataList) {
        this.dictDataList = dictDataList;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
