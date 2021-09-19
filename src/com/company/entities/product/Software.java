package com.company.entities.product;

import com.company.interfaces.Taxable;

public class Software extends Product implements Taxable {

    private String license;

    public Software(int id, String description, String name, double retailPrice, String license) {
        super(id, description, name, retailPrice);
        this.license = license;
    }

    public Software() {}

    public String getLicense() {
        return license;
    }

    @Override
    public double getTax() {
        return this.getRetailPrice() * 0.0;
    }
}
