package com.mariia.syne.taxi_service.controller.user;

import com.mariia.syne.taxi_service.model.User;
import com.mariia.syne.taxi_service.service.impl.UserServiceImpl;
import com.mariia.syne.taxi_service.service.interf.UserService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUserServlet", urlPatterns = {"/delete-user"})
public class DeleteUserServlet extends HttpServlet {

    private final Logger LOGGER = Logger.getLogger(DeleteUserServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("doGet process");
        doDelete(request, response);
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idUser = Integer.parseInt(request.getParameter("id"));

        UserService userService = new UserServiceImpl();
        User userToDelete = userService.findById(idUser);
        userService.delete(userToDelete);

        response.sendRedirect("/users");
    }
}
