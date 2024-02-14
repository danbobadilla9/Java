package com.debuggeando_ideas.interfaces;

import lombok.ToString;


// ToString sobreescribe el metodo tostring es parte de la libreria lombok
@ToString
public class Product {

    private Long id;
    private String name;
    private Double price;


    public  Product(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
