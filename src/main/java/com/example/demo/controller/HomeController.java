package com.example.demo.controller;

import com.example.demo.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("item", new Item("Ołowek", new BigDecimal("1.50"), "https://i.etsystatic.com/17933026/r/il/f3afa1/2010589648/il_1080xN.2010589648_4trc.jpg"));
        //return ;

    return "home";
    }
}
