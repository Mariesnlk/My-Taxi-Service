package com.mariia.syne.taxi_service.dao.impl;

import com.mariia.syne.taxi_service.dao.interf.OrderDAO;
import com.mariia.syne.taxi_service.database.DBHelper;
import com.mariia.syne.taxi_service.model.Order;

import java.sql.*;
import java.util.ArrayList;
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
            Date date = order.getDate();

            String query = "INSERT INTO taxi_servise_db.order(addressFrom, addressTo, passengersNumber, " +
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
            ps.setDate(9, date);

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
    public Order findById(Integer idOrder) {
        Order order = null;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {

            String query = "SELECT * FROM taxi_servise_db.order WHERE id= ?";
            ps = connection.prepareStatement(query);

            ps.setString(1, String.valueOf(idOrder));

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                //Integer idOrder= resultSet.getInt("id");
                String addressFrom = resultSet.getString("addressFrom");
                String addressTo = resultSet.getString("addressTo");
                int passengersNumber = resultSet.getInt("passengersNumber");
                Integer passengersId = resultSet.getInt("passengersId");
                int autoId = resultSet.getInt("autoId");
                double price = resultSet.getDouble("price");
                double discount = resultSet.getDouble("discount");
                int timeToWait = resultSet.getInt("timeToWait");
                Date date = resultSet.getDate("date");

                order = new Order(idOrder, addressFrom, addressTo, passengersNumber, passengersId, autoId, price,
                        discount, timeToWait, date);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM taxi_servise_db.order";
            ps = connection.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idOrder = rs.getInt("id");
                String addressFrom = rs.getString("addressFrom");
                String addressTo = rs.getString("addressTo");
                int passengersNumber = rs.getInt("passengersNumber");
                Integer passengersId = rs.getInt("passengersId");
                Integer autoId = rs.getInt("autoId");
                double price = rs.getDouble("price");
                double discount = rs.getDouble("discount");
                int timeToWait = rs.getInt("timeToWait");
                Date date = rs.getDate("date");

                Order ord = new Order(idOrder, addressFrom, addressTo, passengersNumber, passengersId, autoId, price,
                        discount, timeToWait, date);
                orders.add(ord);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return orders;
    }

    @Override
    public void update(Order order) {
        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {

            Integer id = order.getId();
            String newAddressFrom = order.getAddressFrom();
            String newAddressTo = order.getAddressTo();
            int newPassengersNumber = order.getPassengersNumber();
            Integer newPassengersId = order.getPassengersID();
            Integer newAutoId = order.getAutoID();
            double newPrice = order.getPrice();
            double newDiscount = order.getDiscount();
            int newTimeToWait = order.getTimeToWait();
            Date newDate = order.getDate();

            String query =
                    "UPDATE order SET addressFrom  = '" + newAddressFrom + "',  addressTo = '" + newAddressTo + "', " +
                            "passengersNumber = '" + newPassengersNumber + "', + passengersId = '" + newPassengersId + "', " +
                            "autoId = '" + newAutoId + "' , " + "price = '" + newPrice + "' ," + "discount = '" + newDiscount +
                            "', " + "timeToWait = '" + newTimeToWait + "', " + "date '" + newDate + "' WHERE id = ?";

            ps = connection.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean delete(Order order) {
        boolean result = false;
        int changedRowsNumber = 0;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {

            Integer id = order.getId();

            String query = "DELETE FROM order WHERE id = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            //System.out.println(ps);
            changedRowsNumber = ps.executeUpdate();
            System.out.println("changedRowsNumber=" + changedRowsNumber);
            if (changedRowsNumber > 0) {
                result = true;
            }

        } catch (Exception e) {
            System.out.println(e);
            result = false;
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
