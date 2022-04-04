package com.practise.sitallocation.service;

import com.practise.sitallocation.entity.Sits;
import com.practise.sitallocation.repository.SitRepository;
import com.practise.sitallocation.request.SitRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SitService {

    private final SitRepository sitRepository;

    public void addSits(SitRequest request) {
        Sits sits= Sits.builder().sitNo(request.getSitNo()).allocatedSits(request.getAllocatedSits()).availableSits(request.getAvailableSits()).totalSits(request.getTotalSits()).reservedSits(request.getReservedSits()).floor(request.getFloor()).build();
    }
}
