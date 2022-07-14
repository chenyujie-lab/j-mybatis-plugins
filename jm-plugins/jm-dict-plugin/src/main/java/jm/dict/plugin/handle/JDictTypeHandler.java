package jm.dict.plugin.handle;

import jm.dict.plugin.entity.JDictBase;
import jm.dict.plugin.entity.JDictInteger;
import jm.dict.plugin.entity.JDictString;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: JDictTypeHandle</p>
 * <p>描述: [JDict类型处理器]</p>
 * <p>创建时间: 2022/4/30 20:45</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/4/30 20:45] [Chen Yujie][init]
 */
public class JDictTypeHandler extends BaseTypeHandler<JDictBase> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, JDictBase jDict, JdbcType jdbcType) throws SQLException {
        // 将java类型转换为数据库字段的类型
    }

    @Override
    public JDictBase getNullableResult(ResultSet resultSet, String s) throws SQLException {
        // 将数据库字段的类型转换为java类型
        Object object = resultSet.getObject(s);
        if (object == null) {
            return null;
        }
        if (object.getClass() == Integer.class) {
            return new JDictInteger(Integer.valueOf(String.valueOf(object)));
        } else if (object.getClass() == String.class) {
            return new JDictString(String.valueOf(object));
        }
        return null;
    }

    @Override
    public JDictBase getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public JDictBase getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
