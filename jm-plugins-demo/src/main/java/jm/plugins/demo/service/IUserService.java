package jm.plugins.demo.service;

import jm.plugins.demo.entity.User;

import java.util.List;

public interface IUserService {
    User selectOneById(Integer id);
    List<User> listByIds(List<Integer> ids);

    List<User> listUserHobbyByIds(List<Integer> ids);

    User getUserCompanyByUserId(Integer id);
}
