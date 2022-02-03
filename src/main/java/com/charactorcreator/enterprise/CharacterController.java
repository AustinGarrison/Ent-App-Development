package com.charactorcreator.enterprise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @GetMapping("/character")
    public ResponseEntity getAllCharacters() {
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/character/id/")
    public ResponseEntity getCharacterByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}

