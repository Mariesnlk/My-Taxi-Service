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

@WebServlet(name = "GetUserByIdServlet", urlPatterns = {"/user"})
public class GetUserByIdServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(GetUserByIdServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();

        Integer idUser = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(idUser);
        request.setAttribute("user", user);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/showUser.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);

    }
}
