package com.mariia.syne.taxi_service.dao.impl;

import com.mariia.syne.taxi_service.dao.interf.AutoDAO;
import com.mariia.syne.taxi_service.database.DBHelper;
import com.mariia.syne.taxi_service.model.Auto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoDAOImpl implements AutoDAO {

    @Override
    public void create(Auto auto) {

        DBHelper dbHelper = new DBHelper();
        Connection connection = dbHelper.getConnection();

        PreparedStatement ps = null;

        try {
            int passengersCapacity = auto.getPassengersCapacity();
            String category = auto.getCategory();
            String status = auto.getStatus();

            String query = "INSERT INTO taxi_servise_db.auto(passengersCapacity, category, status) VALUES(?,?,?)";

            ps = connection.prepareStatement(query);

            ps.setInt(1, passengersCapacity);
            ps.setString(2, category);
            ps.setString(3, status);

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
    public Auto findById(Integer idAuto) {
        Auto auto = null;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {

            String query = "SELECT * FROM autos WHERE idAuto = ?";
            ps = connection.prepareStatement(query);

            ps.setString(1, String.valueOf(idAuto));

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                //int idOrder= resultSet.getInt("id");
                int passengersCapacity = resultSet.getInt("passengersCapacity");
                String category = resultSet.getString("category");
                String status = resultSet.getString("status");

                auto = new Auto(idAuto, passengersCapacity, category, status);
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
        return auto;
    }

    @Override
    public List<Auto> findAll() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM autoList";
            ps = connection.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passengersCapacity");
                String category = rs.getString("category");
                String status = rs.getString("status");

                Auto auto = new Auto(idAuto, passengersCapacity, category, status);
                autoList.add(auto);
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
        return autoList;
    }

    @Override
    public void update(Auto entity) {

    }

    @Override
    public boolean delete(Auto entity) {
        return false;
    }

    @Override
    public Auto updateAutoById(Integer idAuto, Auto newAuto) {
        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {

            int newPassengersCapacity = newAuto.getPassengersCapacity();
            String newCategory = newAuto.getCategory();
            String newStatus = newAuto.getStatus();

            String query =
                    "UPDATE auto SET passengersCapacity  = '" + newPassengersCapacity + "', category = '" + newCategory + "', " +
                            "status = '" + newStatus + "' WHERE id = ?";

            ps = connection.prepareStatement(query);

            ps.setInt(1, idAuto);

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
        return newAuto;
    }

    @Override
    public boolean deleteAutoById(Integer idAuto) {
        boolean result = false;
        int changedRowsNumber = 0;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM auto WHERE idAuto = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, idAuto);

            //System.out.println(ps);
            changedRowsNumber = ps.executeUpdate();
            System.out.println("changedRowsNumber=" + changedRowsNumber);
            if (changedRowsNumber > 0) {
                result = true;
            }

        } catch (Exception e) {
            System.out.println(e);
            result = false;
        } finally {
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
