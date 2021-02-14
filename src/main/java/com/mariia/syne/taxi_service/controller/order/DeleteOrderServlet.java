package com.mariia.syne.taxi_service.controller.order;

import com.mariia.syne.taxi_service.model.Order;
import com.mariia.syne.taxi_service.service.impl.OrderServiceImpl;
import com.mariia.syne.taxi_service.service.interf.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteOrderServlet", urlPatterns = {"/delete-order"})
public class DeleteOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doDelete(request, response);
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idOrder = Integer.parseInt(request.getParameter("id"));

        OrderService orderService = new OrderServiceImpl();
        Order orderToDelete = orderService.findById(idOrder);
        orderService.delete(orderToDelete);

        response.sendRedirect("/orders");
    }
}
