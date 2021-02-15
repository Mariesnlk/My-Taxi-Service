package com.mariia.syne.taxi_service.service.impl;

import com.mariia.syne.taxi_service.dao.impl.OrderDAOImpl;
import com.mariia.syne.taxi_service.dao.interf.OrderDAO;
import com.mariia.syne.taxi_service.model.Order;
import com.mariia.syne.taxi_service.service.interf.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Override
    public void create(Order order) {
        OrderDAO orderDAO = new OrderDAOImpl();
        orderDAO.create(order);
    }

    @Override
    public Order findById(Integer id) {
        OrderDAO orderDAO = new OrderDAOImpl();
        Order order = orderDAO.findById(id);
        return order;
    }

    @Override
    public List<Order> findAll() {
        OrderDAO orderDAO = new OrderDAOImpl();
        List<Order> allOrders = orderDAO.findAll();
        return allOrders;
    }

    @Override
    public void update(Order order) {
        OrderDAO orderDAO = new OrderDAOImpl();
        orderDAO.update(order);
    }

    @Override
    public boolean delete(Order order) {
        OrderDAO orderDAO = new OrderDAOImpl();
        boolean result = orderDAO.delete(order);
        //System.out.println("Delete order: " + result);
        return result;
    }
}
