package com.example.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author erfan
 * @since 12/5/19
 */
@RequestMapping(value = "/auth")
@Controller
public class AuthController {

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "welcome";
    }
}
