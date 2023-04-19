package com.traframe.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    LoginService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static boolean authorization(String user, String password) {

    }

    private String find(String user) {
        String query = "Select * from traframe-users where username = " + user;
        return "a";
    }
}
