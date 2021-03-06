package com.mariia.syne.taxi_service.controller.user;

import com.mariia.syne.taxi_service.model.User;
import com.mariia.syne.taxi_service.service.impl.UserServiceImpl;
import com.mariia.syne.taxi_service.service.interf.UserService;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GatAllUsersServlet", urlPatterns = {"/users"})
public class GatAllUsersServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(GatAllUsersServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();

        List<User> allUsers = userService.findAll();
        request.setAttribute("allUsers", allUsers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/allUsers.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);
    }
}
