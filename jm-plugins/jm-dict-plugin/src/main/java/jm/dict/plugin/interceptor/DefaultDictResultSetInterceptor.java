package jm.dict.plugin.interceptor;

import jm.dict.plugin.entity.JMappingObject;
import jm.dict.plugin.functional.JDictDataInputSource;
import jm.dict.plugin.handle.AbstractDictDataHandler;
import jm.dict.plugin.handle.DataMappingHandler;
import jm.dict.plugin.handle.GatherTypeHandler;
import jm.dict.plugin.handle.GetDictDataHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Statement;
import java.util.Properties;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: DefaultDictResultSetInterceptor</p>
 * <p>描述: [字典结果拦截器]</p>
 * <p>创建时间: 2022/4/28 22:16</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/4/28 22:16] [Chen Yujie][init]
 */
@Intercepts({@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})
public class DefaultDictResultSetInterceptor implements Interceptor {

    @Autowired
    private JDictDataInputSource dictDataInputSource;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object proceed = invocation.proceed();

        JMappingObject object = new JMappingObject(proceed, dictDataInputSource);

        AbstractDictDataHandler.Builder builder = new AbstractDictDataHandler.Builder();
        builder
            .nextHandler(new GatherTypeHandler())
            .nextHandler(new GetDictDataHandler())
            .nextHandler(new DataMappingHandler())
            .build()
            .doHandle(object);

        return proceed;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
