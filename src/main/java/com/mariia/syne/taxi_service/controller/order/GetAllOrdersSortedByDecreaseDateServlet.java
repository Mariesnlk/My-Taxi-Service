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

@WebServlet(name = "GetAllOrdersSortedByDecreaseDateServlet", urlPatterns = {"/sort-date-decrease"})
public class GetAllOrdersSortedByDecreaseDateServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OrderService orderService = new OrderServiceImpl();

        List<Order> allSortedOrders = orderService.sortDateDecrease();
        request.setAttribute("allSortedByDateDecreaseOrders", allSortedOrders);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/showOrderSortedByDateDecrease.jsp");
        requestDispatcher.forward(request, response);
    }
}
