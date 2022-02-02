package com.charactorcreator.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CharacterController {
    /*
    Handles root endpoint and returns our index.html
    name is important. don't change the return string.
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
