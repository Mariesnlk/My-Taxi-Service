package com.mariia.syne.taxi_service.controller.auto;

import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.service.impl.AutoServiceImpl;
import com.mariia.syne.taxi_service.service.interf.AutoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateAutoServlet", urlPatterns = {"/update-auto"})
public class UpdateAutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AutoService autoService = new AutoServiceImpl();

        Integer idAuto = Integer.parseInt(request.getParameter("id"));
        Auto auto = autoService.findById(idAuto);
        request.setAttribute("autoToUpdate", auto);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/auto/updateAuto.jsp");
        requestDispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer idAuto = Integer.parseInt(request.getParameter("id"));
        int passengersCapacity = Integer.parseInt(request.getParameter("passengersCapacity"));
        String category = request.getParameter("category");
        String login = request.getParameter("status");

        Auto updateAuto = new Auto(idAuto, passengersCapacity, category, login);
        AutoService autoService = new AutoServiceImpl();

        autoService.update(updateAuto);

        response.sendRedirect("/autos");

    }
}
