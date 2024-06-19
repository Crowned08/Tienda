
package com.Tienda_k.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class indexController {

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("variable","Hola a todos desde el controller");
        model.addAttribute("edad",25);
        return "index";
    }
}
