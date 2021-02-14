package com.mariia.syne.taxi_service;

import com.mariia.syne.taxi_service.dao.impl.AutoDAOImpl;
import com.mariia.syne.taxi_service.dao.impl.OrderDAOImpl;
import com.mariia.syne.taxi_service.dao.impl.UserDAOImpl;
import com.mariia.syne.taxi_service.dao.interf.AutoDAO;
import com.mariia.syne.taxi_service.dao.interf.OrderDAO;
import com.mariia.syne.taxi_service.dao.interf.UserDAO;
import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.model.Order;
import com.mariia.syne.taxi_service.model.User;

import java.util.List;


public class Main {

    public static void main(String[] args) {
//        OrderDAO orderDAO = new OrderDAOImpl();
//
//        Order order = new Order("Kyiv",
//                "Odessa",
//                2,
//                "STANDART",
//                1,
//                2,
//                100.5,
//                12.5,
//                5,
//                 null);
//
//        orderDAO.create(order);


//        AutoDAO autoDAO = new AutoDAOImpl();
//        Auto auto = new Auto(2, "COMFORT", "ACTIVE");
//        autoDAO.create(auto);

//        UserDAO userDAO = new UserDAOImpl();
//        User user = new User("FName7", "LName7", "login7", "password7", "ADMIN");
//        userDAO.create(user);

//        UserDAO userDAO = new UserDAOImpl();
//        List<User> allUsers = userDAO.findAll();
//        System.out.println("users" + allUsers);

//        AutoDAO autoDAO = new AutoDAOImpl();
//        List<Auto> allAutos = autoDAO.findAll();
//        System.out.println(allAutos);

        OrderDAO orderDAO = new OrderDAOImpl();
        List<Order> allOrder = orderDAO.findAll();
        System.out.println(allOrder);

    }
}
