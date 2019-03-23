package com.culturalgalleryarts.Controllers;


import com.culturalgalleryarts.Domains.Customer;
import com.culturalgalleryarts.Interfaces.CustomerInterface;
import com.culturalgalleryarts.Services.CustomerService;
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

    @GetMapping(value = "/id")
    public Customer getCustomerById(@RequestParam ObjectId id){return customerService.getCustomerById(id);}

    @DeleteMapping
    public ResponseEntity<Customer> deleteCustomerByName(@RequestParam String name) {
        customerService.deleteCustomersByName(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
