package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Order;

import java.util.List;

public interface OrderDAO extends CRUDDAO<Order, Integer>{

    List<Order> sortDateIncrease();

    List<Order> sortDateDecrease();

    List<Order> sortPriceIncrease();

    List<Order> sortPriceDecrease();

}
