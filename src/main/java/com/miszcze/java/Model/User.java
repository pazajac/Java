/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miszcze.java.Model;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author BTurek
 */

public class User extends HibernateDaoSupport implements UserInterface{
    
    private String UserId = null;
    private String Login = null;
    private boolean IsTeacher = false;
    
    User temp;
    
    public String getUserId(String Login, String Password) {
        temp = (User) getSession().createCriteria(User.class)
                .add(Restrictions.like("Login", Login))
                .add(Restrictions.like("Password", Password))
                .uniqueResult();
        return temp.UserId;
    }
    
    public String getLogin(){
        return temp.Login;
    }
    
     public boolean getIsTeacher(){
        return temp.IsTeacher;
    }
    
}
