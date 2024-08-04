package com.bje.jamapp.controller;

import com.bje.jamapp.bean.ui.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/get-applications")
    public String getApplications(UserBean userBean) {
        return "Welcome to the home page";
    }
}
