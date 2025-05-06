package com.zajecia.sklep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private BigDecimal price;
    private String imgURL;
    public Item(String name,BigDecimal price,  String imgURL) {
        this.name = name;
        this.price = price;
        this.imgURL = imgURL;
    }



}
