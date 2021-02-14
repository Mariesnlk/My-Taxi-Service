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
import java.sql.Date;

@WebServlet(name = "AddOrderServlet", urlPatterns = {"/add-order"})
public class AddOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/addOrder.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String addressFrom = request.getParameter("addressFrom");
        String addressTo = request.getParameter("addressTo");
        int passengersNumber = Integer.parseInt(request.getParameter("passengersNumber"));
        String autoCategory = request.getParameter("autoCategory");
        Integer passengersID = Integer.valueOf(request.getParameter("passengersID"));
        Integer autoID = Integer.valueOf(request.getParameter("autoID"));
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));
        int timeToWait = Integer.parseInt(request.getParameter("timeToWait"));
        Date data = Date.valueOf(request.getParameter("data"));//?

        Order order = new Order(addressFrom, addressTo, passengersNumber, autoCategory, passengersID, autoID, price,
                discount, timeToWait, data);

        OrderService orderService = new OrderServiceImpl();
        orderService.create(order);
    }
}
