package org.jitscar.services;

public class Authenticator {

    public String authenticate(String username, String password) {
        if (("username".equalsIgnoreCase(username)) && ("password".equals(password))) {
            return "success";
        } else {
            return "failure";
        }
    }
}