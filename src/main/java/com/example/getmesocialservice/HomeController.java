package com.example.getmesocialservice;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.model.userInfo;
import com.example.getmesocialservice.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("userInfo", new userInfo());
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("userinfo", new userInfo());
        model.addAttribute("users", HomeService.getUsers());

        return "contact";
    }

    @PostMapping("/contact")
    public String userSubmit (@ModelAttribute userInfo userinfo , Model model){

        System.out.println(userinfo.getUserName());

        model.addAttribute("userinfo",userinfo);
        return "user";
    }
}