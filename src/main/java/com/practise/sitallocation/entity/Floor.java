package com.practise.sitallocation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Floor {

    @Id
    private String floorNo;
    @OneToOne(targetEntity = Sits.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "totalSits",referencedColumnName = "totalSits",nullable = true)
    private Sits totalSits;


}
