package com.example.spring6.repository;

import com.example.spring6.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {


}
