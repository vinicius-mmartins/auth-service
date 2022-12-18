package com.github.viniciusmartins.authservice.controller;

import com.github.viniciusmartins.authservice.model.dto.LoginDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class SignInController {



    @PostMapping
    public void login(LoginDTO loginDTO){

    }

    @DeleteMapping
    public void logout(){

    }







}
