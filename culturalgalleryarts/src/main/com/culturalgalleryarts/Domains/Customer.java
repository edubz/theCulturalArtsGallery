package com.culturalgalleryarts.Domains;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customers")
public class Customer {

    @Id
    private ObjectId id;
    private String name;
    private String email;
    private Address address;

    public Customer() {}

    public Customer(String id, String name, String email, Address address) {
        this.id = new ObjectId(id);
        this.name = name;
        this.email = email;
        this.address = address;

    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public Address getAddress() {return address;}
    public void setAddress(Address address){this.address = address;}


}
