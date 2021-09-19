package com.company.entities.product;

public class Product {
    private int id;
    private String description;
    private String name;
    private double retailPrice;

    public Product() {
    }

    public Product(int id, String description, String name, double retailPrice) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
