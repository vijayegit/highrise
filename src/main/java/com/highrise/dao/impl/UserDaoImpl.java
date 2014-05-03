package com.highrise.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.highrise.dao.UserDao;
import com.highrise.model.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {
 
    protected UserDaoImpl() {
        super(User.class);
    }
 
    @Override
    public void saveUser(User user) {
        saveOrUpdate(user);
    }
 
    @Override
    public List findUsers(String userName) {
        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
    }
    
    
     

	@Override
	public void deleteUserById(int userID) {
		deleteUserById(userID);
		
	}
}
