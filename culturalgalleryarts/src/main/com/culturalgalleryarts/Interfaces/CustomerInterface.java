package com.culturalgalleryarts.Interfaces;

import com.culturalgalleryarts.Domains.Customer;
import org.bson.types.ObjectId;

import java.util.List;

public interface CustomerInterface {


    public List<Customer> getAllCustomers();
    public Customer addCustomer(Customer customer);
    public void deleteCustomersByName(String name);
    public Customer getCustomerById(ObjectId id);
}
