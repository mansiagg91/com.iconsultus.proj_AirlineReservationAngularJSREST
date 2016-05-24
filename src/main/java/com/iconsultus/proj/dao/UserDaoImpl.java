package com.iconsultus.proj.dao;

import com.iconsultus.proj.model.flight;
import com.iconsultus.proj.model.user_flight;
//import com.iconsultus.testproj.util.CustomHibernateDaoSupport;
//import static java.lang.Class.forName;
//import java.sql.Connection;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.springframework.stereotype.Repository;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
/*
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;*/
import java.util.List;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author mansigarg
 */

@Repository("userDao")
public class UserDaoImpl  extends AbstractDao<Integer, user_flight>   implements UserDao  {
    

   
    public void saveuser_flight(user_flight uf) {
        //getHibernateTemplate().save(uf);
	persist(uf);   
 }

    public List<flight> find_flight(String src){
        return find(src);
        
        
    }
   
    public void update(flight f) {
        //sessionFactory.getCurrentSession()..createQuery(
        //getHibernateTemplate().update(f);
    }

   
    /* public int check(flight f,String src,String dest) {
        
            List avail= (List) sessionFactory.getCurrentSession().createQuery("select f.Avail from flight f where f.src=:src and f.dest=:dest")
                                                     .setParameter("src",src).setParameter("dest",dest);
                
        return (int)avail.get(0);
	}*/

   
     

  
 
 }