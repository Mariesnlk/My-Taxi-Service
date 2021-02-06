package com.mariia.syne.taxi_service.model;

import javax.xml.crypto.Data;

public class Order {

    private Integer id;
    private String addressFrom;
    private String addressTo;
    private int passengersNumber;
    private String autoCategory;
    private Integer passengersID;
    private Integer autoID;
    private double price;
    private double discount;
    private int timeToWait;
    private Data data;

    public Order() {
    }

    public Order(String addressFrom, String addressTo, int passengersNumber, String autoCategory, Integer passengersID,
                 Integer autoID, double price, double discount, int timeToWait, Data data) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.passengersNumber = passengersNumber;
        this.autoCategory = autoCategory;
        this.passengersID = passengersID;
        this.autoID = autoID;
        this.price = price;
        this.discount = discount;
        this.timeToWait = timeToWait;
        this.data = data;
    }

    public Order(Integer id, String addressFrom, String addressTo, int passengersNumber, String autoCategory,
                 Integer passengersID, Integer autoID, double price, double discount, int timeToWait, Data data) {
        this.id = id;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.passengersNumber = passengersNumber;
        this.autoCategory = autoCategory;
        this.passengersID = passengersID;
        this.autoID = autoID;
        this.price = price;
        this.discount = discount;
        this.timeToWait = timeToWait;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public String getAutoCategory() {
        return autoCategory;
    }

    public void setAutoCategory(String autoCategory) {
        this.autoCategory = autoCategory;
    }

    public Integer getPassengersID() {
        return passengersID;
    }

    public void setPassengersID(Integer passengersID) {
        this.passengersID = passengersID;
    }

    public Integer getAutoID() {
        return autoID;
    }

    public void setAutoID(Integer autoID) {
        this.autoID = autoID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getTimeToWait() {
        return timeToWait;
    }

    public void setTimeToWait(int timeToWait) {
        this.timeToWait = timeToWait;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", addressFrom='" + addressFrom + '\'' +
                ", addressTo='" + addressTo + '\'' +
                ", passengersNumber=" + passengersNumber +
                ", autoCategory='" + autoCategory + '\'' +
                ", passengersID=" + passengersID +
                ", autoID=" + autoID +
                ", price=" + price +
                ", discount=" + discount +
                ", timeToWait=" + timeToWait +
                ", data=" + data +
                '}';
    }
}
