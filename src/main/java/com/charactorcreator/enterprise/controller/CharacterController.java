package com.charactorcreator.enterprise.controller;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import com.charactorcreator.enterprise.service.ICharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CharacterController {
   @Autowired
    ICharacterSheetService characterSheetService;

    /**
    * Handles root endpoint and returns our index.html
     */
    @GetMapping("/")
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
    @ResponseBody
    public Iterable<CharacterSheet> fetchAllCharacters() {
        return characterSheetService.fetchAll();
    }

    /**
     * Get character with a given id.
     *
     * Given the parameter id, find an item that corresponds to this unique id.
     *
     * Returns one of the following status codes:
     * 200: character found
     * @param id Get character by ID
     * @return character with the given id
     */
    @GetMapping("/character/{id}/")
    public ResponseEntity getCharacterByID(@PathVariable("id") int id) {
        CharacterSheet foundCharacter = characterSheetService.fetch(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundCharacter, headers, HttpStatus.OK);
    }

    /**
     * Create a new character
     *
     * Creates a json with the information necessary to create a new character
     *
     * Returns one of the following status codes:
     * 200: character created
     * @param character Create Character
     * @return a json with character information
     */
    @PostMapping(value = "/character", consumes = "application/json", produces = "application/json")
    public ResponseEntity createCharacter(@RequestBody CharacterSheet character){
        CharacterSheet newCharacter = null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        try {
            newCharacter = characterSheetService.save(character);
        } catch (Exception e) {

            return new ResponseEntity(headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(newCharacter, headers, HttpStatus.OK);
    }

    /**
     * Delete character
     *
     * Given parameter id, delete character associated with that id
     *
     * Returns one of the following status codes:
     * 200: character created
     * @param id Delete Character
     * @return
     */
    @DeleteMapping("/character/{id}/")
    public ResponseEntity deleteCharacter(@PathVariable("id") int id) throws Exception {
        try {
            characterSheetService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Handles root endpoint and returns our viewCharacters.html
     */
    @RequestMapping("/view-characters")
    public String viewCharacters(Model model){
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setCharacterName("norton");
        model.addAttribute(characterSheet);
        return "viewCharacters";
    }

    @PostMapping("/save/{id}")
    public ResponseEntity save(@PathVariable("id") int id, @RequestBody CharacterSheet characterSheet) throws Exception {
        CharacterSheet newCharacterSheet = null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        try {
            characterSheet.setId(id);
            newCharacterSheet = characterSheetService.save(characterSheet);
        } catch (Exception e) {
            return new ResponseEntity(headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity(newCharacterSheet, headers, HttpStatus.OK);
    }

}

