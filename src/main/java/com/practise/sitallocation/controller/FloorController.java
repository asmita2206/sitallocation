package com.practise.sitallocation.controller;

import com.practise.sitallocation.request.FloorRequest;
import com.practise.sitallocation.service.FloorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/floor")
public class FloorController {

    private final FloorService floorService;

    @PostMapping
    public String addFloor(@RequestBody FloorRequest request){

        floorService.addFloor(request);
        return "floor added Successfully";
    }
}
