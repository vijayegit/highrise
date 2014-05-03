package com.highrise.service;

import java.util.List;

import com.highrise.model.User;

 
public interface UserService {

    User findByUserName(String userName);
    void saveUser(User user);
    void deleteUser(String userName);
    List<User> findUsers(String user);
}
