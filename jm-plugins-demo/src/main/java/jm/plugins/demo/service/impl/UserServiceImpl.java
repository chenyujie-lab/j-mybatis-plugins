package jm.plugins.demo.service.impl;

import jm.plugins.demo.entity.User;
import jm.plugins.demo.mapper.UserMapper;
import jm.plugins.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>项目名称: j-mybatis</p>
 * <p>文件名称: UserServiceImpl</p>
 * <p>描述: [用户Service]</p>
 * <p>创建时间: 2022/5/8 23:01</p>
 *
 * @version 1.0.0
 * @author: <a href="mail to: chenyujie0451@163.com" rel="nofollow">Chen Yujie</a>
 * @update [1][2022/5/8 23:01] [Chen Yujie][init]
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOneById(Integer id) {
        return userMapper.selectOneById(id);
    }

    @Override
    public List<User> listByIds(List<Integer> ids) {
        return userMapper.listByIds(ids);
    }

    @Override
    public List<User> listUserHobbyByIds(List<Integer> ids) {
        return userMapper.listUserHobbyByIds(ids);
    }

    @Override
    public User getUserCompanyByUserId(Integer id) {
        return userMapper.getUserCompanyByUserId(id);
    }
}
