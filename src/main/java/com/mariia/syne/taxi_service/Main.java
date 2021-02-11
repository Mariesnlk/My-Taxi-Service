package com.mariia.syne.taxi_service;

import com.mariia.syne.taxi_service.dao.impl.OrderDAOImpl;
import com.mariia.syne.taxi_service.dao.interf.OrderDAO;
import com.mariia.syne.taxi_service.model.Order;


public class Main {

    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAOImpl();

        Order order = new Order("Kyiv",
                "Odessa",
                2,
                "STANDART",
                1,
                2,
                100.5,
                12.5,
                5,
                 null);

        orderDAO.create(order);



    }
}
