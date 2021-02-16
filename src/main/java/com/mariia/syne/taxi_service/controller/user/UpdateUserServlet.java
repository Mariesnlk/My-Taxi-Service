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

@WebServlet(name = "UpdateUserServlet", urlPatterns = {"/update-user"})
public class UpdateUserServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(UpdateUserServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();

        Integer idUser = Integer.parseInt(request.getParameter("id"));
        User user = userService.findById(idUser);
        request.setAttribute("userToUpdate", user);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/updateUser.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer idUser = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        User updatedUser = new User(idUser, firstName, lastName, login, password, role);
        UserService userService = new UserServiceImpl();

        userService.update(updatedUser);

        response.sendRedirect("/users");

    }
}
