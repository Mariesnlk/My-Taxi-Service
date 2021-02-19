package com.mariia.syne.taxi_service.model;

public class Auto {

    private Integer id;
    private int passengersCapacity;
    private String category;
    private String status;

    public Auto() {
    }

    public Auto(int passengersCapacity, String category, String status) {
        this.passengersCapacity = passengersCapacity;
        this.category = category;
        this.status = status;
    }

    public Auto(Integer id, int passengersCapacity, String category, String status) {
        this.id = id;
        this.passengersCapacity = passengersCapacity;
        this.category = category;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "autoId=" + id +
                ", passengersCapacity=" + passengersCapacity +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
