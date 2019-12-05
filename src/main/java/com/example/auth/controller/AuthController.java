package com.example.auth.controller;

import com.example.auth.domain.User;
import com.example.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author erfan
 * @since 12/5/19
 */
@RequestMapping(value = "/auth")
@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping(value = "/registration")
    public String registration(ModelMap model) {
        model.put("userForm", new User());

        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@ModelAttribute("userForm") User userForm,
                               BindingResult bindingResult,
                               ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        return "redirect:/welcome";
    }

    @GetMapping(value = "/login")
    public String login(ModelMap model, String error, String logout) {

        if (error != null) {
            model.put("error", "Your username and password is invalid.");
        }

        if (logout != null) {
            model.put("message", "You have been logged out successfully.");
        }

        model.put("userForm", new User());

        return "login";
    }

}
