package com.culturalgalleryarts.controllers;


import com.culturalgalleryarts.Domains.Customer;
import com.culturalgalleryarts.interfaces.CustomerInterface;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerDatabaseController {

    @Autowired
    private CustomerInterface customerService;

    @PostMapping (value = "/validation")
    public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer){
        return new ResponseEntity(customerService.addCustomer(customer), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomerById(@PathVariable ObjectId id){return customerService.getCustomerById(id);}

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Customer> deleteCustomerById(@PathVariable ObjectId id) {
        customerService.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
