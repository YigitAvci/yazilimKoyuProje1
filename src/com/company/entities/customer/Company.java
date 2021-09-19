package com.company.entities.customer;

public class Company extends Customer{
    private String contact;
    private int discount;

    public Company(String address, int id, String name, String phone, String contact) {
        super(address, id, name, phone);
        this.contact = contact;
    }

    public Company() {
        super();
    }

    public int getDiscount() {
        return discount;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}
