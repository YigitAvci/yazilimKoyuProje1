package com.company.entities.product;

import com.company.interfaces.Taxable;

public class Manual extends Product implements Taxable {

    private String publisher;

    public Manual(int id, String description, String name, double retailPrice) {
        super(id, description, name, retailPrice);
    }

    public Manual() {}

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public double getTax() {
        return this.getRetailPrice() * 0.08;
    }
}
