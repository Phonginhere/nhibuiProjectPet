package com.example.layoutadmin;

public class Booking {
    public Booking() {
    }

    public String address;
    public String payment;
    public String totalPrice;


    public Booking(String address, String payment, String totalPrice) {
        this.address = address;
        this.payment = payment;
        this.totalPrice = totalPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
