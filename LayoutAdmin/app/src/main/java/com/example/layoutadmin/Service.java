package com.example.layoutadmin;

import java.io.Serializable;

public class Service implements Serializable {
    public String name;
    public String price;
    public String time;

    public Service(String name, String price, String time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Service() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


