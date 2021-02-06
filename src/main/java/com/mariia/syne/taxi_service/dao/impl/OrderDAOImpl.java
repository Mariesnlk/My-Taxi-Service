package com.mariia.syne.taxi_service.dao.impl;

import com.mariia.syne.taxi_service.dao.interf.OrderDAO;
import com.mariia.syne.taxi_service.database.DBHelper;
import com.mariia.syne.taxi_service.model.Order;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public void create(Order order) {

        DBHelper dbHelper = new DBHelper();
        Connection connection = dbHelper.getConnection();

        PreparedStatement ps = null;

        try {
            String addressFrom = order.getAddressFrom();
            String addressTo = order.getAddressTo();
            int passengersNumber = order.getPassengersNumber();
            Integer passengersId = order.getPassengersID();
            Integer autoId = order.getPassengersID();
            double price = order.getPrice();
            double discount = order.getDiscount();
            int timeToWait = order.getTimeToWait();
            Data date = order.getData();

            String query = "INSERT INTO taxi_servise_db.order(addressFrom, addressTo, passengersNumber," +
                    "passengersId, autoId,  price, discount,  timeToWait, date) VALUES(?,?,?,?,?,?,?,?,?)";

            ps = connection.prepareStatement(query);

            ps.setString(1, addressFrom);
            ps.setString(2, addressTo);
            ps.setInt(3, passengersNumber);
            ps.setInt(4, passengersId);
            ps.setInt(5, autoId);
            ps.setDouble(6, price);
            ps.setDouble(7, discount);
            ps.setInt(8, timeToWait);
            ps.setDate(9, (Date) date);

            ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

    }

    @Override
    public Order findById(Integer id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public void update(Order entity) {

    }

    @Override
    public void delete(Order entity) {

    }
}
