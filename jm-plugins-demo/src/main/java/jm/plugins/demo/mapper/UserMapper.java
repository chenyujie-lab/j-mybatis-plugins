package jm.plugins.demo.mapper;

import jm.plugins.demo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    @Select({"select * from users where id=#{userId}"})
    User selectOneById(Integer id);

    List<User> listByIds(List<Integer> ids);

    List<User> listUserHobbyByIds(List<Integer> ids);

    User getUserCompanyByUserId(Integer id);
}
