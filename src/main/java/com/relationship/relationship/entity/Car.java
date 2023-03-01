package com.relationship.relationship.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;
    private String car_name;


    @OneToOne(mappedBy = "car")
    @JsonIgnore
    private Owner owner;
}
