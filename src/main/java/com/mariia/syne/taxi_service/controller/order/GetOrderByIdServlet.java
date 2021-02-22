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

@WebServlet(name = "GetOrderByIdServlet", urlPatterns = {"/order"})
public class GetOrderByIdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OrderService orderService = new OrderServiceImpl();

        Integer idOrder = Integer.parseInt(request.getParameter("id"));
        Order order = orderService.findById(idOrder);
        request.setAttribute("order", order);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/showOrder.jsp");
        requestDispatcher.forward(request, response);

    }
}
