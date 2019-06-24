package com.example.xutrade;

public class Item {
    private int id;
    private String name;
    private String owner;
    private String condition;
    private Double price;

    public Item() {
        id = 0;
        name = "Chair";
        owner = "John";
        condition = "Good";
        price = 13.50;
    }

    public Item(int id, String name, String owner, String condition, Double price) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.condition = condition;
        this.price = price;

    }
}