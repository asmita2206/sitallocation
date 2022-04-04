package com.practise.sitallocation.request;

import com.practise.sitallocation.entity.Floor;
import lombok.Data;

@Data
public class SitRequest {
    private Integer sitNo;
    private int totalSits;
    private int allocatedSits;
    private int availableSits;
    private int reservedSits;
    private Floor floor;
}
