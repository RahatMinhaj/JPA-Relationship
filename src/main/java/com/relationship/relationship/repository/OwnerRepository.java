package com.relationship.relationship.repository;

import com.relationship.relationship.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

//    @Query(value = "select * from owner where id = : p_id limit 1 ")
//    Owner getByPropertyID(@Param("p_id")  Long id);
}
