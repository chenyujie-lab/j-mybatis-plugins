package jm.dict.plugin.selector;

import jm.dict.plugin.interceptor.DefaultDictResultSetInterceptor;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: JDictSelector</p>
 * <p>描述: [类型描述]</p>
 * <p>创建时间: 2022/4/30 22:45</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/4/30 22:45] [Chen Yujie][init]
 */
public class JDictSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                DefaultDictResultSetInterceptor.class.getName()
        };
    }
}
