package com.zajecia.sklep.controller;

import com.zajecia.sklep.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    static List<Item> items= new ArrayList<>();
    static {
        items.add (new Item( "Olej CBD",new BigDecimal(60),
            "https://a-medyczny.pl/14121/olej-konopny-cbd-30-10ml-hemp-medical.jpg"));
        items.add(new Item("Mydło konopne",new BigDecimal(35),
                "https://s2.bioorganika.pl/6068-15326/mydlo-potasowe-szare-konopne-cbd-200mg-etja-80g.jpg"));
        items.add(new Item("Lizak",new BigDecimal(5),"https://naturalniezkonopi.pl/wp-content/uploads/2020/02/13_optimized-1.png"));
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", items);
        return "home";
    }
}
