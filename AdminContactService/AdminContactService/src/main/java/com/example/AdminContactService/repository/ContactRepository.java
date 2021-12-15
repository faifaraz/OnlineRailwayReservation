package com.example.AdminContactService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdminContactService.model.Contact;

public interface ContactRepository extends MongoRepository<Contact, Integer>{

}
