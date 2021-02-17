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
import java.util.List;

@WebServlet(name = "GetAllAutosSortedByCapacityIncreaseServlet", urlPatterns = {"/sort-capacity-increase"})
public class GetAllAutosSortedByCapacityIncreaseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AutoService autoService = new AutoServiceImpl();

        List<Auto> allSortedAutos = autoService.sortCapacityIncrease();
        request.setAttribute("allSortedByCapacityIncreaseAutos", allSortedAutos);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/auto/showAutosSortedByCapacityIncrease.jsp");
        requestDispatcher.forward(request, response);
    }
}
