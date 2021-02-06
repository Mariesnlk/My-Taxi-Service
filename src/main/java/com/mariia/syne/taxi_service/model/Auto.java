package com.mariia.syne.taxi_service.model;

public class Auto {

    private Integer autoId;
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

    public Auto(Integer autoId, int passengersCapacity, String category, String status) {
        this.autoId = autoId;
        this.passengersCapacity = passengersCapacity;
        this.category = category;
        this.status = status;
    }

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
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
                "autoId=" + autoId +
                ", passengersCapacity=" + passengersCapacity +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
