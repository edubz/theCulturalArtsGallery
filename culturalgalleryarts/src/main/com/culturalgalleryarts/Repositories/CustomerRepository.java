package com.culturalgalleryarts.Repositories;

import com.culturalgalleryarts.Domains.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    void deleteByName(String name);
    Customer getById(ObjectId id);
}
