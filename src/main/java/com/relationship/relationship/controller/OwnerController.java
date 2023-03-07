package com.relationship.relationship.controller;


import com.relationship.relationship.entity.Owner;
import com.relationship.relationship.entity.Property;
import com.relationship.relationship.repository.OwnerRepository;
import com.relationship.relationship.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepo;

    @Autowired
    private PropertyRepository propRepo;


    @PostMapping("/createowner")
    public Owner createOwner(@RequestBody Owner owner){
        return ownerRepo.save(owner);
    }

    @GetMapping("/findownerbyid")
    public Owner getByID(){
        return ownerRepo.findById(2L).get();
    }


    @GetMapping("/carlist")
    public List<Owner> getOwnerList(){
        return ownerRepo.findAll();
    }



    @PostMapping("/propertycreate")
    public Property propCreate(@RequestBody Property property){
        return propRepo.save(property);
    }

    @GetMapping("/proplist")
    public List<Property> getProp(){
        return  propRepo.findAll();
    }

    @GetMapping("/ownerlist")
    public List<Owner> getownerlist(){

//return ownerRepo.findAll();

        List<Owner> lis = ownerRepo.findAll();
        List<Owner> ls = new ArrayList<>();

        for (Owner d:lis) {
            if (d.getProperties()!=null){
                System.out.println("Null Dep");
//                d.setDepartment(null);
//                for (:
//                     ) {
//                }
//                d.setProperties(null);
                ls.add(d);
            }

        }


        return ls;
    }


    @GetMapping("/propertyList")
    public List<Property> getProperties(){

//return ownerRepo.findAll();

        List<Property> lis = propRepo.findAll();
        List<Property> ls = new ArrayList<>();

        for (Property d:lis) {

            if (d.getOwner()!=null){
                System.out.println("Null Dep");
                Owner ow = new Owner();
                ow=d.getOwner();
                ow.setProperties(null);
                d.setOwner(ow);
            }

        }


        return lis;
    }

}
