package com.company;

import com.company.entities.customer.Company;
import com.company.entities.customer.Customer;
import com.company.entities.customer.Individual;
import com.company.entities.order.Order;
import com.company.entities.order.OrderItem;
import com.company.entities.product.Hardware;
import com.company.entities.product.Manual;
import com.company.entities.product.Product;
import com.company.entities.product.Software;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Hardware hardware1 = new Hardware();
        hardware1.setId(1);
        hardware1.setWarrantyPeriod(6);
        hardware1.setName("laptop");
        hardware1.setRetailPrice(8500);
        hardware1.setDescription("Intel® Tiger Lake Core™ i5-11400H 6C/12T; 12MB L3; 8GT/s; 2.7GHz > 4.5GHz; 45W; 10nm SuperFin\n" +
                "Nvidia RTX3050 TI Max-Performance 4GB GDDR6 128-Bit DX12\n" +
                "17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\n" +
                "8GB (1x8GB) DDR4 1.2V 3200MHz SODIMM\n" +
                " 500GB CRUCIAL P2 PCIe M.2 2280 PCIe 3.0 x4\n" +
                "FreeDos (İşletim sistemi bulunmamaktadır.\n" +
                "3 Adet Disk Desteği (2x M.2 SSD + 1x 2.5\" Disk)\n" +
                "RGB Tek Bölge Aydınlatmalı Klavye\n" +
                "25,9mm Kalınlık\n" +
                "2,5kg Ağırlık\n" +
                "Alüminyum İle Güçlendirilmiş Kasa\n" +
                "Monster Sırt Çantası Hediye");
        OrderItem orderItem1 = new OrderItem(1, hardware1, 1);

        Software software1 = new Software(2, "Operating System", "windows 11", 550, "home license");
        OrderItem orderItem2 = new OrderItem(2, software1, 1);

        Manual manual1 = new Manual(3
                , "Since this Jolt-award winning classic was last updated in 2008, the Java programming environment has changed dramatically. Java 7 and Java 8 introduced new features and functions including, forEach() method in Iterable interface, default and static methods in Interfaces, Functional Interfaces and Lambda Expressions, Java Stream API for Bulk Data Operations on Collections, Java Time API, Collection API improvements, Concurrency API improvements, and Java IO improvements."
                , "effective java"
                , 264);
        OrderItem orderItem3 = new OrderItem(3, manual1, 2);

        Individual individualCustomer = new Individual("istanbul/turkey", 1, "yiğit avcı", "34532345", "243523");

        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(orderItem1);
        orderItems1.add(orderItem2);
        orderItems1.add(orderItem3);
        Order order1 = new Order(individualCustomer, 1, orderItems1);

        System.out.println("order 1:\norder id: " + order1.getId() + "\norder customer: " + order1.getCustomer().getName() + "\norder date: " + order1.getOrderDate() + "\norder total: " + order1.getOrderTotal());

        Hardware hardware2 = new Hardware(53, "all in one computer", "imac", 15000.0, 12);
        OrderItem orderItem4 = new OrderItem(4, hardware2, 17);
        List<OrderItem> orderItems2 = Arrays.asList(orderItem4);
        Company company = new Company("paris / france", 2, "bugysoft", "3498574", "olivier giroud");
        Order order2 = new Order(company, 234, orderItems2);

        System.out.println("order 2:\norder id: " + order2.getId() + "\norder customer: " + order2.getCustomer().getName() + "\norder date: " + order2.getOrderDate() + "\norder total: " + order2.getOrderTotal());

    }
}
