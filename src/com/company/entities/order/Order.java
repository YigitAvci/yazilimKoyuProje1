package com.company.entities.order;

import com.company.entities.customer.Customer;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {
    private Customer customer;
    private int id;
    private List<OrderItem> items;
    private Date orderDate;
    private double orderTotal;

    public Order(){
    }

    public Order(Customer customer, int id, List<OrderItem> items) {
        this.customer = customer;
        this.id = id;
        this.items = items;
        this.orderDate = new Date();
        this.orderTotal = orderTotal;
        calculateOrderTotal();
    }

    public void addOrderItem(OrderItem orderItem) {
        items.add(orderItem);
        calculateOrderTotal();
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
        calculateOrderTotal();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    private void calculateOrderTotal() {
        double orderTotal = 0;
        for(OrderItem item : items) {
            orderTotal += item.getRetailTotal() * item.getQuantity();
        }
        this.orderTotal = orderTotal;
    }
}
