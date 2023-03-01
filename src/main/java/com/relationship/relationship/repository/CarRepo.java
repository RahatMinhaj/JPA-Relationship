package com.relationship.relationship.repository;

import com.relationship.relationship.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car , Long> {
}
