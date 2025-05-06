package com.zajecia.sklep.controller;

import com.zajecia.sklep.model.Item;
import com.zajecia.sklep.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ItemRepository itemRepository;
    @Autowired
    public AdminController(ItemRepository itemRepository)
    {this.itemRepository = itemRepository;}

    @GetMapping
    private String adminPage()
    {
        return "adminview/addItem";
    }

    @PostMapping
    private String addItem(Item item)
    {
        itemRepository.save(item);
        return "redirect:/";
    }

}
