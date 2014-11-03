package org.jitscar.services;

import org.jitscar.models.User;

public class LoginService {

    private User user;

    public LoginService(){
//        user = new User ();
//        user.setUserName("admin");
//        user.setPassword("admin");
    }

    public boolean isValidUser(String userName, String password){
        if (userName.equals(user.getUsername()) && password.equals(user.getPassword())){
            return true;
        }
        return false;
    }

    public User getUser(){
        return user;
    }
}
