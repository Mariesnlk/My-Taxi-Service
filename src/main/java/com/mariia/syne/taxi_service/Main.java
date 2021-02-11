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


        AutoDAO autoDAO = new AutoDAOImpl();
        Auto auto = new Auto(2, "COMFORT", "ACTIVE");
        autoDAO.create(auto);

//        UserDAO userDAO = new UserDAOImpl();
//        User user = new User("FName6", "LName6", "login6", "password6", "CLIENT");
//        userDAO.create(user);


    }
}
