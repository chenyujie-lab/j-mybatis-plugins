package jm.dict.plugin.utils;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;

/**
 * <p>项目名称:  j-mybatis</p>
 * <p>文件名称: DefaultMetaObject</p>
 * <p>描述: [MetaObject工具类]</p>
 * <p>创建时间: 2022/4/30 20:34</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/4/30 20:34] [Chen Yujie][init]
 */
public class DefaultMetaObject {
    private final static DefaultMetaObject DEFAULT_META_OBJECT = new DefaultMetaObject();
    private ObjectFactory objectFactory = new DefaultObjectFactory();
    private ObjectWrapperFactory objectWrapperFactory = new DefaultObjectWrapperFactory();
    private ReflectorFactory reflectorFactory = new DefaultReflectorFactory();

    private DefaultMetaObject () {}

    public static DefaultMetaObject instance() {
        return DefaultMetaObject.DEFAULT_META_OBJECT;
    }

    public MetaObject newMetaObject(Object object) {
        return MetaObject.forObject(object, this.objectFactory, this.objectWrapperFactory, this.reflectorFactory);
    }
}
