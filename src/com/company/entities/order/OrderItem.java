package com.company.entities.order;

import com.company.entities.product.Product;

public class OrderItem {
    private int lineNbr;
    private Product product;
    private int quantity;

    public OrderItem() {

    }

    public OrderItem(int lineNbr, Product product, int quantity) {
        this.lineNbr = lineNbr;
        this.product = product;
        this.quantity = quantity;
    }

    public double getRetailTotal() {
        return this.product.getRetailPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getLineNbr() {
        return lineNbr;
    }

    public void setLineNbr(int lineNbr) {
        this.lineNbr = lineNbr;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
