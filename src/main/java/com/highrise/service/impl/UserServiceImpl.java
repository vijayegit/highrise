package com.highrise.service.impl;

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
		
	}

    @Transactional
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

    @Transactional
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

    @Transactional(readOnly=false)
	@Override
	public User findByStockCode(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

 
}
