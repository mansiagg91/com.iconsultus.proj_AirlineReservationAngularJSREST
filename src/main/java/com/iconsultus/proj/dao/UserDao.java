/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iconsultus.proj.dao;

import com.iconsultus.proj.model.flight;
import com.iconsultus.proj.model.user_flight;
import java.util.List;

/**
 *
 * @author mansigarg
 */


public interface UserDao {
  
    
    void saveuser_flight(user_flight uf);
    List<flight> find_flight(String src);
    //void update(flight f);
    //int check(flight f,String src,String dest);
       //List check1(flight f,String dest);
    
    /*public boolean isValidUser(String userName,String password);
    public boolean establishConnection();
    public boolean saveUser(String userName,String password);
   */     
    
    
}
