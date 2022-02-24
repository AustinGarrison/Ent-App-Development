package com.charactorcreator.enterprise;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CharacterController {

    /**
    * Handles root endpoint and returns our index.html
     */
    @RequestMapping("/")
    public String index(Model model){
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setCharacterName("norton");
        model.addAttribute(characterSheet);
        return "index";
    }

    @GetMapping("/character")
    public ResponseEntity getAllCharacters() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/character/{id}/")
    public ResponseEntity getCharacterByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/character", consumes = "application/json", produces = "application/json")
    public CharacterSheet createCharacter(@RequestBody CharacterSheet character){
        return character;
    }

    @DeleteMapping("/character/{id}/")
    public ResponseEntity deleteCharacter(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}

