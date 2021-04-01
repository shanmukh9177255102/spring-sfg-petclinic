package com.springpetclinic.petclinic.sfgpetclinic.controllers;

import org.springframewor.sfpetclinicdata.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping({"/pets","/pets/index","/pets/index.html"})
    public String listPets(Model m){
        m.addAttribute("pets",petService.findAll());
        return "pets/index";
    }
}
