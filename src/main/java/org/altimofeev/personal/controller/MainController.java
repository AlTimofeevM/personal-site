package org.altimofeev.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting( Model model) {
        return "index";
    }

    @GetMapping("/projects")
    public String projects( Model model) {
        return "projects";
    }
}