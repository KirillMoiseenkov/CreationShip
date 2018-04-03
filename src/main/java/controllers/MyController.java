package controllers;

import models.main.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyController {


    ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

    UserService userService = context.getBean(UserService.class);

    @GetMapping(value = "/hello")
    public User hello(ModelMap model){

        User user = new User();
        user.setId(1L);
        user.setName("Kirill");
        user.setLogin("login");
        user.setPassword("password");
        user.setLastName("moiseenkov");
        //System.out.println("Pozor - hello");
        System.out.println("something");

        //model.addAttribute("message", "Spring 3 MVC Hello World!!!");
        return userService.getById(1L);//"MyHello";

    }

}
