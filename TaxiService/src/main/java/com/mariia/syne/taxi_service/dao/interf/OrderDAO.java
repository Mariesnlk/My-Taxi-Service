package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.Order;

import java.util.List;

public interface OrderDAO extends CRUDDAO<Order, Integer>{

    public List<Order> sortDateIncrease();

    public List<Order> sortDateDecrease();

    public List<Order> sortPriceIncrease();

    public List<Order> sortPriceDecrease();

}
