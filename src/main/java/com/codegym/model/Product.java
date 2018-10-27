package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String email;
    private String address;
    private double gia;

    public Product(){

    }

    public Product(int id, String name, String email, String address, double gia) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
