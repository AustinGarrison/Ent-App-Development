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

    /**
     * Get all characters.
     *
     * Returns one of the following status codes:
     * 200: characters found
     *
     * @return all created characters
     */
    @GetMapping("/character")
    public ResponseEntity getAllCharacters() {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Get character with a given id.
     *
     * Given the parameter id, find an item that corresponds to this unique id.
     *
     * Returns one of the following status codes:
     * 200: character found
     * @param id
     * @return character with the given id
     */
    @GetMapping("/character/{id}/")
    public ResponseEntity getCharacterByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Create a new character
     *
     * Creates a json with the information necessary to create a new character
     *
     * Returns one of the following status codes:
     * 200: character created
     * @param character
     * @return a json with character information
     */
    @PostMapping(value = "/character", consumes = "application/json", produces = "application/json")
    public CharacterSheet createCharacter(@RequestBody CharacterSheet character){
        return character;
    }

    /**
     * Delete character
     *
     * Given parameter id, delete character associated with that id
     *
     * Returns one of the following status codes:
     * 200: character created
     * @param id
     * @return
     */
    @DeleteMapping("/character/{id}/")
    public ResponseEntity deleteCharacter(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}

