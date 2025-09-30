package com.coforge.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

/**
* Author	:Rohit.10.Gupta
* Date 		:Sep 29, 2025
* Time		:4:15:53 PM
* Project	:hello-world
* 
 *  LoginController handles user authentication and session management.
 * 	It provides endpoints for login, dashboard access, and logout.
 *  The controller uses HttpSession to manage user sessions.
 *  It demonstrates basic form handling and redirection in a Spring MVC application.
*/

@Controller
public class LoginController {

	@GetMapping("/login")
    public String loginForm() {
        return "login"; // login.jsp
    }

	@PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               HttpSession session,
                               Model model) {
        if ("admin".equals(username) && "1234".equals(password)) {
            // store user in session
            session.setAttribute("loggedInUser", username);
            return "redirect:/dashboard"; // redirect after login
        } else {
            model.addAttribute("error", "Invalid username or password!");
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        String user = (String) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login"; // no session, redirect to login
        }
        model.addAttribute("user", user);
        model.addAttribute("message", "Welcome to the Dashboard!");
        model.addAttribute("date", new java.util.Date());
        return "dashboard"; // dashboard.jsp
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // clear session
        return "redirect:/login";
    }


}

