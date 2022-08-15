package com.example.demo.repository;

import com.example.demo.model.Cubicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CubicleRepository extends CrudRepository<Cubicle, Integer> {

}
