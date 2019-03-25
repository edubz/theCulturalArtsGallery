package com.culturalgalleryarts.controllers;


import com.culturalgalleryarts.Domains.Address;
import com.culturalgalleryarts.Domains.Customer;
import com.culturalgalleryarts.interfaces.CustomerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    CustomerInterface customerService;

    @RequestMapping("/")
    public String showIndex(Model model){
        return "index.html";
    }

    @RequestMapping("/gallery")
    public String showGallery(Model model){
        return "gallery.html";
    }

    @RequestMapping("/shop")
    public String showShop(Model model){
        return "shop.html";

    }
    @RequestMapping("/cart")
    public String showValidation(Model model){
        return "validation.html";

    }

    @PostMapping(value = "/checkout")
    public ResponseEntity addCustomer(@Valid @ModelAttribute("SpringWeb") Address address, Customer customer, ModelMap model){
        customer.setAddress(address);

        return new ResponseEntity(customerService.addCustomer(customer), HttpStatus.CREATED);
    }


    @GetMapping(value = "/checkout")
    public String returnHome(){
        return "informationTab.html";
    }
}
