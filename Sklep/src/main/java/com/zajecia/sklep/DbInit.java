package com.zajecia.sklep;
import com.zajecia.sklep.model.Item;
import com.zajecia.sklep.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;


@Configuration
public class DbInit implements CommandLineRunner {
    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
            new Item( "Olej CBD",new BigDecimal(60),
                "https://a-medyczny.pl/14121/olej-konopny-cbd-30-10ml-hemp-medical.jpg"),
                new Item   ( "Mydło konopne",new BigDecimal(35),
                "https://s2.bioorganika.pl/6068-15326/mydlo-potasowe-szare-konopne-cbd-200mg-etja-80g.jpg"),
        new Item("Lizak",new BigDecimal(5),"https://naturalniezkonopi.pl/wp-content/uploads/2020/02/13_optimized-1.png")));
    }
}
