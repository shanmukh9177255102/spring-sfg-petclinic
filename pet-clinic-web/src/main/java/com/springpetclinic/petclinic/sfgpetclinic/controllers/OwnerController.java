package com.springpetclinic.petclinic.sfgpetclinic.controllers;

import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnersService ownersService;

    public OwnerController(OwnersService ownersService) {
        this.ownersService = ownersService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String listOwners(Model m){
        m.addAttribute("owners",ownersService.findAll());
        return "owners/index";
    }
}
