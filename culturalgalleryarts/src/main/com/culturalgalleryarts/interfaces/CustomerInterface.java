package com.culturalgalleryarts.interfaces;

import com.culturalgalleryarts.Domains.Customer;
import org.bson.types.ObjectId;

import java.util.List;

public interface CustomerInterface {


    public List<Customer> getAllCustomers();
    public Customer addCustomer(Customer customer);
    public void deleteCustomerById(ObjectId id);
    public Customer getCustomerById(ObjectId id);
}
