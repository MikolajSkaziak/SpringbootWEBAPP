package com.zajecia.sklep.controller;

import com.zajecia.sklep.model.Item;
import com.zajecia.sklep.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private final ItemRepository itemRepository;

   @Autowired
   public HomeController(ItemRepository itemRepository)
   {
       this.itemRepository = itemRepository;
   }


    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("items", itemRepository.findAll());
        return "home";
    }
}
