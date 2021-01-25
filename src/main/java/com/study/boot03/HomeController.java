package com.study.boot03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="/index")
    public String index(Model model){

        User user = new User(25, "park");
        model.addAttribute("user", user);
        System.out.println("user : " + user);

        model.addAttribute("test", "Paaark");

        return "index";
    }

}
