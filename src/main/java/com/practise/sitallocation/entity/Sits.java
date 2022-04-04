package com.practise.sitallocation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sits {

    @Id
    private Integer sitNo;
    private int totalSits;
    private int allocatedSits;
    private int availableSits;
    private int reservedSits;

    @OneToOne(targetEntity = Floor.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "floorNo",referencedColumnName = "floorNo", nullable = false)
    private Floor floor;

}
