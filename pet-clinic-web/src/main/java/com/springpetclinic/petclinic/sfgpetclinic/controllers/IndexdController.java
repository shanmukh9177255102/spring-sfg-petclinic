package com.springpetclinic.petclinic.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexdController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oops")
    public String findOwners() {
        return "notImplemented";
    }

}
/*
linkedlist
arrays
paranthesis - balanced, longest
infix,prefix,postfix
core java concepts
 */
