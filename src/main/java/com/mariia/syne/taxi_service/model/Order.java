package com.mariia.syne.taxi_service.model;

import java.sql.Date;

public class Order {

    private Integer id;
    private String addressFrom;
    private String addressTo;
    private int passengersNumber;
    private Integer passengersId;
    private Integer autoId;
    private double price;
    private double discount;
    private int timeToWait;
    private Date date;


    public Order(String addressFrom, String addressTo, int passengersNumber, Integer passengersId,
                 Integer autoId, double price, double discount, int timeToWait, Date date) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.passengersNumber = passengersNumber;
        this.passengersId = passengersId;
        this.autoId = autoId;
        this.price = price;
        this.discount = discount;
        this.timeToWait = timeToWait;
        this.date = date;
    }

    public Order(Integer id, String addressFrom, String addressTo, int passengersNumber,
                 Integer passengersId, Integer autoId, double price, double discount, int timeToWait, Date date) {
        this.id = id;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.passengersNumber = passengersNumber;
        this.passengersId = passengersId;
        this.autoId = autoId;
        this.price = price;
        this.discount = discount;
        this.timeToWait = timeToWait;
        this.date = date;
    }

    public Integer getId() {
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

    public Integer getPassengersID() {
        return passengersId;
    }

    public void setPassengersID(Integer passengersID) {
        this.passengersId = passengersID;
    }

    public Integer getAutoID() {
        return autoId;
    }

    public void setAutoID(Integer autoID) {
        this.autoId = autoID;
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

    public Date getDate() {
        return date;
    }

    public void setData(Date data) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", addressFrom='" + addressFrom + '\'' +
                ", addressTo='" + addressTo + '\'' +
                ", passengersNumber=" + passengersNumber +
                ", passengersID=" + passengersId +
                ", autoID=" + autoId +
                ", price=" + price +
                ", discount=" + discount +
                ", timeToWait=" + timeToWait +
                ", data=" + date +
                '}';
    }
}
