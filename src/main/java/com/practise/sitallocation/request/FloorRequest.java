package com.practise.sitallocation.request;

import com.practise.sitallocation.entity.Sits;
import lombok.Data;

@Data
public class FloorRequest {
    private String floorNo;
    private Sits totalSits;
}
