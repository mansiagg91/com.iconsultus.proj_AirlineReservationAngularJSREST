/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iconsultus.proj.service;

import com.iconsultus.proj.dao.UserDao;
import com.iconsultus.proj.model.flight;
import com.iconsultus.proj.model.user_flight;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mansigarg
 */
@Service ("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;  
     
    // private user_flight uf=new user_flight();
    //private flight f=new flight();
    

   /* @Override
    public boolean authenticate(String userName, String passsword) {
     return  userDao.isValidUser(userName, passsword);
    }*/

    
    public void saveuser_flight(user_flight uf) {
        userDao.saveuser_flight(uf);
    }

    
    public List<flight> find_flight(String src){
        
        return userDao.find_flight(src );
    }
    /* @Override
    public void update(flight f) {
        
        userDao.update(f);
    }

    

    @Override
     public int check(String src,String dest) {
        int e= userDao.check(f, src,dest);
       return e;
    }
    */
    
    
    
}
