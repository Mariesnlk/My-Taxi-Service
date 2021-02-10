package com.mariia.syne.taxi_service.dao.impl;

import com.mariia.syne.taxi_service.dao.interf.UserDAO;
import com.mariia.syne.taxi_service.database.DBHelper;
import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public void create(User user) {

        DBHelper dbHelper = new DBHelper();
        Connection connection = dbHelper.getConnection();

        PreparedStatement ps = null;

        try {
            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String login = user.getLogin();
            String password = user.getPassword();
            String role = user.getRole();

            String query = "INSERT INTO taxi_servise_db.user(firstName, lastName, login, password, role) VALUES(?,?,?,?,?)";

            ps = connection.prepareStatement(query);

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, login);
            ps.setString(4, password);
            ps.setString(5, role);

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
    public User findById(Integer idUser) {
        User user = null;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {

            String query = "SELECT * FROM user WHERE idUser = ?";
            ps = connection.prepareStatement(query);

            ps.setString(1, String.valueOf(idUser));

            resultSet = ps.executeQuery();

            while (resultSet.next()) {

                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                String role = resultSet.getString("role");

                user = new User(idUser, firstName, lastName, login, password, role);
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
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            String query = "SELECT * FROM userList";
            ps = connection.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {
                Integer idUser = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String login = rs.getString("login");
                String password = rs.getString("password");
                String role = rs.getString("role");

                User user = new User(idUser, firstName, lastName, login, password, role);
                userList.add(user);
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
        return userList;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public boolean delete(User entity) {
        return false;
    }

    @Override
    public User updateUserById(Integer idUser, User newUser) {
        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {

            String newFirstName = newUser.getFirstName();
            String newLastName = newUser.getLastName();
            String newLogin = newUser.getLogin();
            String newPassword = newUser.getPassword();
            String newRole = newUser.getRole();

            String query =
                    "UPDATE user SET firstName  = '" + newFirstName + "', lastName = '" + newLastName + "', " +
                            "login = '" + newLogin + "', " + "password = '" + newPassword + "'," + "role = '" + newRole +
                            "' WHERE id = ?";

            ps = connection.prepareStatement(query);

            ps.setInt(1, idUser);

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
        return newUser;

    }

    @Override
    public boolean deleteUserById(Integer idUser) {
        boolean result = false;
        int changedRowsNumber = 0;

        DBHelper objectDBHelper = new DBHelper();
        Connection connection = objectDBHelper.getConnection();

        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM user WHERE idUser = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, idUser);

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
