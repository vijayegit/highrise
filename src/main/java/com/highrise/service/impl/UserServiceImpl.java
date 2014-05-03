package com.highrise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.highrise.dao.UserDao;
import com.highrise.model.User;
import com.highrise.service.UserService;


@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}

    @Transactional
	@Override
	public void update(User user) {
    	userDao.saveOrUpdate(user);
		
	}

    @Transactional
	@Override
	public void delete(User user) {
    	 user = userDao.findById(user.getUserName());
         if (user != null) {
             userDao.delete(user);
         }
		
	}

     
	@Override
	public void deleteUserById(int userID) {
		// TODO Auto-generated method stub
		userDao.deleteUserById(userID);
	}

 
}
