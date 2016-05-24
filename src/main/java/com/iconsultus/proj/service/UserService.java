/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iconsultus.proj.service;

import com.iconsultus.proj.model.flight;
import com.iconsultus.proj.model.user_flight;
import java.util.List;

/**
 *
 * @author mansigarg
 */
public interface UserService {
  /*  public boolean authenticate(String userName,String passsword);
    
}*/
void saveuser_flight(user_flight uf);
    //	void update(flight f);
    //	int check(String src,String dest);
List<flight> find_flight(String src);
       
}
