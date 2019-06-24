package com.example.xutradde;

import java.util.ArrayList;
import java.util.Random;

public class Item {
    private int id;
    private String name;
    private String owner;
    private String condition;

    public Item() {
        id = 0;
        name = "Chair";
        owner = "John";
        condition = "Good";
    }
    public Item(int id, String name, String owner, String condition){
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.condition = condition;

    }
}
