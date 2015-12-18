package com.example.ezequiel.unittests1.login;

public class LoginService {

    public boolean login(String username, String password) {
        return "james".equals(username) && "bond".equals(password);
    }

}
