package com.culturalgalleryarts.repositories;

import com.culturalgalleryarts.Domains.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    void deleteById(ObjectId id);
    Customer getById(ObjectId id);
}
