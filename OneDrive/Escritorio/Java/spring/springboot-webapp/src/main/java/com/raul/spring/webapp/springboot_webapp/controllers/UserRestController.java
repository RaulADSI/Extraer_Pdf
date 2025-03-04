package com.raul.spring.webapp.springboot_webapp.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.spring.webapp.springboot_webapp.models.User;
import com.raul.spring.webapp.springboot_webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @RequestMapping("/details")
    public UserDto details() {

        User user = new User("Aquiles", "Voy");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot!!!");
        return userDto;
    }

    @RequestMapping("/list")
    public List<User> list() {
        User user = new User("Aquiles", "Voy");
        User user1 = new User("Aquiles", "Brinco");
        User user2 = new User("Aquiles", "Bailo");

        List<User> users = Arrays.asList(user, user1, user2);
        /*
         * users.add(user);
         * users.add(user1);
         * users.add(user2);
         */
        return users;
    }

    @RequestMapping("/details-map")
    public Map<String, Object> details2() {

        User user = new User("Cosme", "Fulanito");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot!!!");
        body.put("User", user);
        return body;
    }
}
