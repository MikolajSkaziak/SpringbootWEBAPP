package com.zajecia.sklep.controller;

import com.zajecia.sklep.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    private String adminPage()
    {
        return "adminview/addItem";
    }
    @PostMapping
    private String addItem(Item item)
    {
        HomeController.items.add(item);
        return "redirect:/";
    }

}
