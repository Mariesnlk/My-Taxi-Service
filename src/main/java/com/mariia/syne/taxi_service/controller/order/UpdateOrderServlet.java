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

@WebServlet(name = "UpdateOrderServlet", urlPatterns = {"/update-order"})
public class UpdateOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OrderService orderService = new OrderServiceImpl();

        Integer idOrder = Integer.parseInt(request.getParameter("id"));
        Order order = orderService.findById(idOrder);
        request.setAttribute("orderToUpdate", order);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/updateOrder.jsp");
        requestDispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer idOrder = Integer.parseInt(request.getParameter("id"));
        String addressFrom = request.getParameter("addressFrom");
        String addressTo = request.getParameter("addressTo");
        int passengersNumber = Integer.parseInt(request.getParameter("passengersNumber"));
        Integer passengersId = Integer.parseInt(request.getParameter("passengersId"));
        Integer autoId = Integer.parseInt(request.getParameter("autoId"));
        Double price = Double.valueOf(request.getParameter("price"));
        Double discount = Double.valueOf(request.getParameter("discount"));
        int timeToWait = Integer.parseInt(request.getParameter("timeToWait"));
        Date date = Date.valueOf(request.getParameter("date"));

        Order updateOrder = new Order(idOrder, addressFrom, addressTo, passengersNumber, passengersId, autoId, price,
                discount, timeToWait, date);
        OrderService orderService = new OrderServiceImpl();

        orderService.update(updateOrder);

        response.sendRedirect("/orders");

    }
}
