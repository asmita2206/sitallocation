package com.practise.sitallocation.controller;

import com.practise.sitallocation.request.LoginRequest;
import com.practise.sitallocation.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public void getLogin(LoginRequest request){
        loginService.getLogin(request);
    }
}
