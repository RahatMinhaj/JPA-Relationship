package com.relationship.relationship.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long propId;
    private String propName;

//    @JsonIgnore

//    @JsonBackReference
//@JsonManagedReference
//    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER,optional = true)
    @JoinColumn(name = "owner_id",referencedColumnName = "ownerId",nullable = true )
    public Owner owner;
//
//


//    public Owner getOwner() {
//        owner.setProperties(null);
//        return owner;
//    }
}
