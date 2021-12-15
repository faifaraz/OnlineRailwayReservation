package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Train;

@Repository
public interface TrainRepository extends MongoRepository<Train, Integer> {

}
