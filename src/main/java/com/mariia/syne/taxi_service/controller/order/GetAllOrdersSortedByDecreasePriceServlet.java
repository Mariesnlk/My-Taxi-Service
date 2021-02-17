package com.mariia.syne.taxi_service.controller.order;

import com.mariia.syne.taxi_service.model.Order;
import com.mariia.syne.taxi_service.service.impl.OrderServiceImpl;
import com.mariia.syne.taxi_service.service.interf.OrderService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetAllOrdersSortedByDecreasePriceServlet", urlPatterns = {"/sort-price-decrease"})
public class GetAllOrdersSortedByDecreasePriceServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OrderService orderService = new OrderServiceImpl();

        List<Order> allSortedOrders = orderService.sortPriceDecrease();
        request.setAttribute("allSortedByPriceDecreaseOrders", allSortedOrders);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/showOrderSortedByPriceDecrease.jsp");
        requestDispatcher.forward(request, response);
    }
}
