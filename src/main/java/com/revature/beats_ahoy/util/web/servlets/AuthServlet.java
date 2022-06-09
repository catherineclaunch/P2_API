package com.revature.beats_ahoy.util.web.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beats_ahoy.users.Users;
import com.revature.beats_ahoy.users.UsersServices;
import com.revature.beats_ahoy.util.web.dto.LoginCreds;
import com.revature.pokedex.util.exceptions.AuthenticationException;
import com.revature.pokedex.util.exceptions.InvalidRequestException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

// @WebServlet("/auth") // this requires a default No-Args constructor, but we make our own constructor in line 24

public class AuthServlet extends HttpServlet {

    private final UsersServices usersServices;
    // ObjectMapper provided by jackson
    private final ObjectMapper mapper;

    public AuthServlet(UsersServices usersServices, ObjectMapper mapper) {
        this.usersServices = usersServices;
        this.mapper = mapper;
    }
}