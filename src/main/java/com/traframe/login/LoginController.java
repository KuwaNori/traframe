package com.traframe.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(Model model) {
        return "login/login";
    }

    @PostMapping("/login")
    public boolean postLogin(@RequestParam("user") String user, @RequestParam("password") String password) {
        return true;
    }
}
