package com.culturalgalleryarts.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
    @RequestMapping("/information")
    public String showInfo(Model model){
        return "informationTab.html";

    }
}
