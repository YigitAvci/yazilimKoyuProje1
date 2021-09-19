package com.company.entities.customer;

public class Individual extends Customer{

    private String licNumber;

    public Individual(String address, int id, String name, String phone, String licNumber) {
        super(address, id, name, phone);
    }

    public Individual() {
        super();
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    public String getLicNumber() {
        return licNumber;
    }

    @Override
    public String toString() {
        return "individual info; id: " + this.getId() + ", name: " + this.getName() + ", address: " + this.getAddress() + ", phone: " +
                this.getPhone() + ", lic number: " + this.getLicNumber();
    }

}
