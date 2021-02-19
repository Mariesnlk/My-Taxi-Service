package com.mariia.syne.taxi_service.controller.auto;

import com.mariia.syne.taxi_service.model.Auto;
import com.mariia.syne.taxi_service.service.impl.AutoServiceImpl;
import com.mariia.syne.taxi_service.service.interf.AutoService;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetAutoByIdServlet", urlPatterns = {"/auto"})
public class GetAutoByIdServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(GetAutoByIdServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AutoService autoService = new AutoServiceImpl();

        Integer idAuto = Integer.parseInt(request.getParameter("id"));
        Auto auto = autoService.findById(idAuto);
        request.setAttribute("auto", auto);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/auto/showAuto.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);

    }
}
