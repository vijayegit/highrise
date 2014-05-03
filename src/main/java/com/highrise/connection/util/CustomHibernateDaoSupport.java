package com.highrise.connection.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

 

public abstract class CustomHibernateDaoSupport  extends HibernateDaoSupport{

	@Autowired
    public void connectionFactory(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}
