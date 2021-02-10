package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Order;

public interface OrderDAO extends CRUDDAO<Order,Integer>{

    Order findById(Integer idOrder);

    Order updateOrder(Integer idOrder, Order newOrder);

    boolean deleteOrderById(Integer idOrder);
}
