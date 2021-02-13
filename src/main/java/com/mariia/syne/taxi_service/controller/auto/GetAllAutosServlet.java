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
import java.util.List;

@WebServlet(name = "GetAllAutosServlet", urlPatterns = {"/autos"})
public class GetAllAutosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AutoService autoService = new AutoServiceImpl();

        List<Auto> allAutos = autoService.findAll();
        request.setAttribute("allAutos", allAutos);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/auto/allAutos.jsp");
        requestDispatcher.forward(request, response);
    }
}
