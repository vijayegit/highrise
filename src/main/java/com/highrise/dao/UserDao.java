package com.highrise.dao;

import java.util.List;

 
import com.highrise.model.User;

public interface UserDao extends AbstractDao<User, String> {
    void saveUser(User user);
    List<User> findUsers(String userName);
}
