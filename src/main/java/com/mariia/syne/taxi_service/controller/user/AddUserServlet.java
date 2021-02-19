package com.mariia.syne.taxi_service.controller.user;

import com.mariia.syne.taxi_service.model.User;
import com.mariia.syne.taxi_service.service.impl.UserServiceImpl;
import com.mariia.syne.taxi_service.service.interf.UserService;
import com.mariia.syne.taxi_service.util.FieldsValidator;
import com.sun.corba.se.impl.io.FVDCodeBaseImpl;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUserServlet", urlPatterns = {"/add-user"})
public class AddUserServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(AddUserServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/user/addUser.jsp");
        LOGGER.info("doGet process");
        requestDispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        User user = new User(firstName, lastName, login, password, role);

        if (firstName.length() > 0 && lastName.length() > 0 ) {
        //if (firstName.length() > 0 && lastName.length() > 0 && FieldsValidator.isCorrectWord(firstName) && FieldsValidator.isCorrectWord(firstName)) {
            UserService userService = new UserServiceImpl();
            userService.create(user);

            request.setAttribute("lastName", lastName);
        }
        LOGGER.info("doPost process");
        doGet(request, response);
    }

}
