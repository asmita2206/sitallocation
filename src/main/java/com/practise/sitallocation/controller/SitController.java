package com.practise.sitallocation.controller;

import com.practise.sitallocation.request.SitRequest;
import com.practise.sitallocation.service.SitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sits")
public class SitController {

    private final SitService service;

    @PostMapping
    public String addSits(@RequestBody SitRequest request){
        service.addSits(request);
        return "sits added successfully";
    }
}
