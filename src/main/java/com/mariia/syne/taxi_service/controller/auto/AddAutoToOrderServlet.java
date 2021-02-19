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

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@WebServlet(name = "AddAutoToOrderServlet",urlPatterns = {"/add-auto-to-order"})
public class AddAutoToOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AutoService autoService = new AutoServiceImpl();

        Integer idAuto = Integer.parseInt(request.getParameter("id"));
        Auto chosenAuto = autoService.findById(idAuto);
        request.setAttribute("chosenAuto", chosenAuto);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/order/addOrder.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);
    }
}
