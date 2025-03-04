package com.raul.spring.webapp.springboot_webapp.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.raul.spring.webapp.springboot_webapp.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Aquiles", "Brinco");
        user.setEmail("aqui@mail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot!!!");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
                new User("Lalo", "Landa"),
                new User("Pepa", "Perez"),
                new User("Cosme", "Fulanito", "cosfu@mail.com"),
                new User("Anita", "Lava la tina"));

        return users;
    }
}
