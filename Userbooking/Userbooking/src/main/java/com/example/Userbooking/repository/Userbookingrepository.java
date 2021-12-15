package com.example.Userbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Userbooking.model.bookingorder;

public interface Userbookingrepository extends MongoRepository<bookingorder, String> {

}
