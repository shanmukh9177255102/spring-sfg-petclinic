package com.springpetclinic.petclinic.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

    @RequestMapping({"/pets","/pets/index","/pets/index.html"})
    public String listPets(){
        return "pets/index";
    }
}
