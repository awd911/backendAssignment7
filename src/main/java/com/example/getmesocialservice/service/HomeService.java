package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public static List<User> getUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User("Tom","ExamplePic","Good looking guy, great coder");
        User user2 = new User("Nick","ExamplePic2","Movie making meistro");

        users.add(user1);
        users.add(user2);

        return users;

    }
}
