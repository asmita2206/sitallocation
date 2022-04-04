package com.practise.sitallocation.service;

import com.practise.sitallocation.entity.Floor;
import com.practise.sitallocation.repository.FloorRepository;
import com.practise.sitallocation.request.FloorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FloorService {

    private final FloorRepository floorRepository;

    public void addFloor(FloorRequest request) {

        Floor floor=Floor.builder().floorNo(request.getFloorNo()).totalSits(request.getTotalSits()).build();
        floorRepository.save(floor);

    }
}
