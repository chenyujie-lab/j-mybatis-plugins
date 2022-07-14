package jm.dict.plugin.entity;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: JDictInteger</p>
 * <p>描述: [整型字典值]</p>
 * <p>创建时间: 2022/4/30 20:36</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/4/30 20:36] [Chen Yujie][init]
 */
public class JDictInteger extends JDictBase<Integer> {

    public JDictInteger() {
    }

    public JDictInteger(Integer value) {
        super(value);
    }

    public JDictInteger(String type, Integer value) {
        super(type, value);
    }
}
