package com.ywm.ssh.daoImpl;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport; 

import com.ywm.ssh.dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao {
	
    @Override  
    public void saveObject(Object obj) throws HibernateException {  
    	
    	getSessionFactory().openSession().save(obj);
    	//transaction.commit();
    	
    } 

}
