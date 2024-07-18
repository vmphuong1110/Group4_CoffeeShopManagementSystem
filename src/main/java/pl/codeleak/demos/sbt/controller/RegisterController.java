package pl.codeleak.demos.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.codeleak.demos.sbt.model.Users;
import pl.codeleak.demos.sbt.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping
    public String registerUser(Users user) {

        user.setRole(1);
        user.setAvatar("abc");


        userService.saveUser(user);

        return "redirect:/login";
    }
}
