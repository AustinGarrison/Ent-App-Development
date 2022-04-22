package com.charactorcreator.enterprise;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import com.charactorcreator.enterprise.service.CharacterSheetServiceStub;
import com.charactorcreator.enterprise.service.ICharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CharacterController {
    @Autowired
    ICharacterSheetService characterSheetService;

    /**
     * Handles root endpoint and returns our index.html
     */
    @RequestMapping("/")
    public String index(Model model) {
        CharacterSheet characterSheet = new CharacterSheet();
        model.addAttribute(characterSheet);
        return "index";
    }

    /**
     * Get all characters.
     * <p>
     * Returns one of the following status codes:
     * 200: characters found
     *
     * @return all created characters
     */
    @GetMapping("/character")
    @ResponseBody
    public List<CharacterSheet> fetchAllCharacters() {
        return characterSheetService.fetchAll();
    }

    /**
     * Get character with a given id.
     * <p>
     * Given the parameter id, find an item that corresponds to this unique id.
     * <p>
     * Returns one of the following status codes:
     * 200: character found
     *
     * @param id
     * @return character with the given id
     */
    @GetMapping("/character/{id}/")
    public ResponseEntity getCharacterByID(@PathVariable("id") int id) {
        CharacterSheet foundCharacter = characterSheetService.fetchByID(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundCharacter, headers, HttpStatus.OK);
    }




    @GetMapping("/characters/{characterId}/")

    public ModelAndView characterByID(@PathVariable("characterId") int characterId) {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("viewCharacters");

        CharacterSheet characters = characterSheetService.fetchByID(characterId);

        modelAndView.addObject("characters", characters);

        return modelAndView;

    }

    /**
     * Create a new character
     * <p>
     * Creates a json with the information necessary to create a new character
     * <p>
     * Returns one of the following status codes:
     * 200: character created
     *
     * @param character
     * @return a json with character information
     */
    @PostMapping(value = "/character", consumes = "application/json", produces = "application/json")
    public ResponseEntity createCharacter(@RequestBody CharacterSheet character) {
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
     * <p>
     * Given parameter id, delete character associated with that id
     * <p>
     * Returns one of the following status codes:
     * 200: character created
     *
     * @param id
     * @return
     */
    @DeleteMapping("/character/{id}/")
    public ResponseEntity deleteCharacter(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Handles root endpoint and returns our viewCharacters.html
     */
    @RequestMapping("/view-characters")
    public String viewCharacters(Model model) {
        CharacterSheet characterSheet = new CharacterSheet();
        model.addAttribute(characterSheet);
        return "viewCharacters";
    }

    @PostMapping("/saveCharacter")
    public ModelAndView saveCharacter(CharacterSheet characterSheet) {
        ModelAndView modelAndView = new ModelAndView();
        String returnValue = "index";
        try {
            characterSheetService.save(characterSheet);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");

            return modelAndView;
        }
        modelAndView.setViewName(returnValue);
        modelAndView.addObject("characterSheet", characterSheet);
        return modelAndView;
    }
}

