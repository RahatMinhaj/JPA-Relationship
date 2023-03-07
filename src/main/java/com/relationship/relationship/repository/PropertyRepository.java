package com.relationship.relationship.repository;

import com.relationship.relationship.entity.Owner;
import com.relationship.relationship.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepository  extends JpaRepository<Property , Long> {


}
