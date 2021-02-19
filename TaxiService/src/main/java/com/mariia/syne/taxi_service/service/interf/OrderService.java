package com.mariia.syne.taxi_service.service.interf;

import com.mariia.syne.taxi_service.model.Order;

import java.util.List;

public interface OrderService  extends CRUDService<Order, Integer> {

    List<Order> sortDateIncrease();

    List<Order> sortDateDecrease();

    List<Order> sortPriceIncrease();

    List<Order> sortPriceDecrease();

}
