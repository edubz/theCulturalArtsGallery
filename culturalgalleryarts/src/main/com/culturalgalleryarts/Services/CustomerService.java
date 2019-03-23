package com.culturalgalleryarts.Services;

import com.culturalgalleryarts.Domains.Customer;
import com.culturalgalleryarts.Interfaces.CustomerInterface;
import com.culturalgalleryarts.Repositories.CustomerRepository;
import com.culturalgalleryarts.exceptions.ServerError;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import java.util.*;

import static com.culturalgalleryarts.StringConstant.*;

@Service
public class CustomerService implements CustomerInterface {

    private final CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }


    @Override
    public List<Customer> getAllCustomers() {
        try {
            return customerRepo.findAll();
        } catch(DataAccessResourceFailureException e) {
            throw new ServerError(SERVER_ERROR_MESSAGE);
        }
    }
    @Override
    public Customer addCustomer(Customer customer) {
        try {
            return customerRepo.save(customer);
        } catch(DataAccessResourceFailureException e) {
            throw new ServerError(SERVER_ERROR_MESSAGE);
        }
    }

    @Override
    public void deleteCustomersByName(String name) {
        try {
            customerRepo.deleteByName(name);
        } catch(DataAccessResourceFailureException e) {
            throw new ServerError(SERVER_ERROR_MESSAGE);
        }
    }

    @Override
    public Customer getCustomerById(ObjectId id){
        try {
            return customerRepo.getById(id);
        } catch(DataAccessResourceFailureException e) {
            throw new ServerError(SERVER_ERROR_MESSAGE);
        }
    }
}
