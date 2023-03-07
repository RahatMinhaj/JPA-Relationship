package com.relationship.relationship.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    private String ownerName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cId", referencedColumnName = "carId" )
    private Car car;

//    working......................
//    @JsonIgnore
//    @JsonManagedReference
    @OneToMany(mappedBy = "owner" ,fetch = FetchType.EAGER,cascade = CascadeType.PERSIST, targetEntity = Property.class)
    private Set<Property> properties;
//
//


}
