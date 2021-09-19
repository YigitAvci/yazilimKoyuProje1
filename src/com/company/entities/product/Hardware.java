package com.company.entities.product;

import com.company.interfaces.Taxable;

public class Hardware extends Product implements Taxable {
    private int warrantyPeriod;

    public Hardware(int id, String description, String name, double retailPrice, int warrantyPeriod) {
        super(id, description, name, retailPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public Hardware() {}

    @Override
    public double getTax() {
        return this.getRetailPrice() * 0.18;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
