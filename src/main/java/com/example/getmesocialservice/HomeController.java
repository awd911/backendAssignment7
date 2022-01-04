package com.example.getmesocialservice;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.HomeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("User", new User());
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){

        model.addAttribute("users", HomeService.getUsers());

        return "contact";
    }
    @PostMapping("/contact")
    public String userSubmit (@ModelAttribute User user, Model model){

        System.out.println(user);

        model.addAttribute("users",user);
        return "result";
    }
}
