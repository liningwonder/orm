package com.lining.orm.mapper;

import com.lining.orm.model.User;

import java.util.List;

/**
 * description:
 * date 2018-03-05
 *
 * @author lining1
 * @version 1.0.0
 */
public interface UserMapper {

    public User getUser(int id);
    public int deleteUser(int id);
    public int insertUser(User user);
    public List<User> selectAll();
}
