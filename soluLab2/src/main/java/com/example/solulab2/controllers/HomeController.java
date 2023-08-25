package com.example.solulab2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "hola :D";
    }

    @RequestMapping(value = {"/navbar"})
    public String navbarView(){
        return "index";
    }
}
