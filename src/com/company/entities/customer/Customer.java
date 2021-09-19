package com.company.entities.customer;

public class Customer {
    private String address;
    private int id;
    private String name;
    private String phone;

    public Customer(String address, int id, String name, String phone) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
