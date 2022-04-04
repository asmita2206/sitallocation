package com.practise.sitallocation.service;

import com.practise.sitallocation.repository.LoginRepository;
import com.practise.sitallocation.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

    public void getLogin(LoginRequest request) {
       // loginRepository.showSits(request);
    }
}
