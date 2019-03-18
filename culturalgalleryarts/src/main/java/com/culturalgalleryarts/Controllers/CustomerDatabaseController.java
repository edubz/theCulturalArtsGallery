package com.culturalgalleryarts.Controllers;


import com.culturalgalleryarts.Domains.Customer;
import com.culturalgalleryarts.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerDatabaseController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping (value = "/validation", method = RequestMethod.POST)
    public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer){
        return new ResponseEntity(customerService.addCustomer(customer), HttpStatus.CREATED);
    }
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/customers", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomerByName(@RequestParam String name) {
        customerService.deleteCustomersByName(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
