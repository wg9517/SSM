package com.fanwen.controller;

import com.fanwen.entity.User;
import com.fanwen.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
// /user/**
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    // /user/test?id=1
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException {
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:" + userId);
        User user = null;
        if (userId == 1) {
            user = new User();
            user.setId(1);
            user.setPassword("123");
        }
        log.debug(user.toString());
        model.addAttribute("user", user);
        request.getSession().setAttribute("user", user);
        response.sendRedirect("/src/main/web/WEB-INF/jsp/index.jsp");
        return "";
    }
}
