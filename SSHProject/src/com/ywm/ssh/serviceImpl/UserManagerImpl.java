package com.ywm.ssh.serviceImpl;

import org.hibernate.HibernateException;  
import org.springframework.beans.BeanUtils;  
  
import com.ywm.ssh.beans.Users;  
import com.ywm.ssh.dao.BaseDao;  
import com.ywm.ssh.forms.UserForm;  
import com.ywm.ssh.service.UserManager;


public class UserManagerImpl implements UserManager {
	
    private BaseDao dao;  
    
    public void setDao(BaseDao dao) {  
        this.dao = dao;  
    }  
  
    @Override  
    public void regUser(UserForm userForm) throws HibernateException {  
        Users user = new Users();  
        BeanUtils.copyProperties(userForm, user);  
        dao.saveObject(user);  
    }
}
