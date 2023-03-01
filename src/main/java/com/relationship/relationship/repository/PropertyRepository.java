package com.relationship.relationship.repository;

import com.relationship.relationship.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository  extends JpaRepository<Property , Long> {
}
