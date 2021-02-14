package com.mariia.syne.taxi_service.service.impl;

import com.mariia.syne.taxi_service.dao.impl.UserDAOImpl;
import com.mariia.syne.taxi_service.dao.interf.UserDAO;
import com.mariia.syne.taxi_service.model.User;
import com.mariia.syne.taxi_service.service.interf.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public void create(User user) {
        UserDAO userDAO = new UserDAOImpl();
        userDAO.create(user);
    }

    @Override
    public User findById(Integer id) {
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.findById(id);
        return user;
    }

    @Override
    public List<User> findAll() {
        UserDAO userDAO = new UserDAOImpl();
        List<User> allUsers = userDAO.findAll();
        return allUsers;
    }

    @Override
    public void update(User user) {
        UserDAO userDAO = new UserDAOImpl();
        userDAO.update(user);
    }

    @Override
    public boolean delete(User user) {
        UserDAO userDAO = new UserDAOImpl();
        boolean result = userDAO.delete(user);
        //System.out.println("Delete user: " + result);
        return result;
    }
}
