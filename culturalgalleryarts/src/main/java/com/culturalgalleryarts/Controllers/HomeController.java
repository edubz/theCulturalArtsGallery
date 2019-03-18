package com.culturalgalleryarts.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;

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
}
