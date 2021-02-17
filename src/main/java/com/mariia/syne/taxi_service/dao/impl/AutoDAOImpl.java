package com.mariia.syne.taxi_service.dao.impl;

import com.mariia.syne.taxi_service.dao.interf.AutoDAO;
import com.mariia.syne.taxi_service.database.DBHelper;
import com.mariia.syne.taxi_service.model.Auto;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoDAOImpl implements AutoDAO {

    private static final Logger LOG = Logger.getLogger(AutoDAOImpl.class);

    @Override
    public void create(Auto auto) {

        DBHelper dbHelper = new DBHelper();
        Connection connection = dbHelper.getConnection();

        PreparedStatement ps = null;

        try {
            int passengersCapacity = auto.getPassengersCapacity();
            String category = auto.getCategory();
            String status = auto.getStatus();

            String query = "INSERT INTO taxi_servise_db.auto(passangersCapacity, category, status) VALUES(?,?,?)";

            ps = connection.prepareStatement(query);

            LOG.debug("Executed query" + query);

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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //System.out.println(e);
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

            String query = "SELECT * FROM auto WHERE id = ?";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            ps.setString(1, String.valueOf(idAuto));

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                //int idOrder= resultSet.getInt("id");
                int passengersCapacity = resultSet.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
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

            String query = "SELECT * FROM auto";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public void update(Auto auto) {
        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {

            Integer id = auto.getId();
            int newPassengersCapacity = auto.getPassengersCapacity();
            String newCategory = auto.getCategory();
            String newStatus = auto.getStatus();

            String query =
                    "UPDATE auto SET passangersCapacity  = '" + newPassengersCapacity + "', category = '" + newCategory + "', " +
                            "status = '" + newStatus + "' WHERE id = ?";

            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean delete(Auto auto) {
        boolean result = false;
        int changedRowsNumber = 0;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {
            Integer id = auto.getId();

            String query = "DELETE FROM auto WHERE id = ?";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

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
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public List<Auto> sortCapacityIncrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY passangersCapacity ASC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public List<Auto> sortCapacityDecrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY passangersCapacity DESC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public List<Auto> sortCategoryIncrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY category ASC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public List<Auto> sortCategoryDecrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY category DESC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public List<Auto> sortStatusIncrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY status ASC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }

    @Override
    public List<Auto> sortStatusDecrease() {
        List<Auto> autoList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM auto ORDER BY status DESC";
            ps = connection.prepareStatement(query);
            LOG.debug("Executed query" + query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idAuto = rs.getInt("id");
                int passengersCapacity = rs.getInt("passangersCapacity");
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
                    LOG.error("SQLException occurred in AutoDaoImpl", e);
                    //e.printStackTrace();
                }
            }
        }
        return autoList;
    }
}
