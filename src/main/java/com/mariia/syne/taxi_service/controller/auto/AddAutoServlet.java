package com.mariia.syne.taxi_service.controller.auto;

import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.model.User;
import com.mariia.syne.taxi_service.service.impl.AutoServiceImpl;
import com.mariia.syne.taxi_service.service.impl.UserServiceImpl;
import com.mariia.syne.taxi_service.service.interf.AutoService;
import com.mariia.syne.taxi_service.service.interf.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddAutoServlet", urlPatterns = {"/add-auto"})
public class AddAutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/auto/addAuto.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int passengersCapacity = Integer.parseInt(request.getParameter("passengersCapacity"));
        String category = request.getParameter("category");
        String status = request.getParameter("status");

        Auto auto = new Auto(passengersCapacity, category, status);

        AutoService autoService = new AutoServiceImpl();
        autoService.create(auto);
    }
}
