package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
@Profile({"dev", "default"})
public class CharacterSheetSQLDAO implements ICharacterSheetDAO {
    @Autowired
    CharacterSheetRepository characterSheetRepository;

    /**
     * The save function accepts a characterSheet object and saves it to the characterSheetRepository
     * @param characterSheet - a new character sheet that has been created in the web app
     * @return The characterSheet object that was saved
     * @throws Exception if the application cannot connect to the database server
     */
    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        CharacterSheet createdCharacterSheet = characterSheetRepository.save(characterSheet);
        return createdCharacterSheet;
    }

    /**
     * The fetchAll function returns a list of all characterSheet objects in the characterSheetRepository
     * @return a list of all characterSheets in the characterSheetRepository
     */
    @Override
    public List<CharacterSheet> fetchAll() {
        List<CharacterSheet> allCharacterSheets = new ArrayList<>();
        Iterable<CharacterSheet> characterSheets = characterSheetRepository.findAll();
        for (CharacterSheet characterSheet : characterSheets) {
            allCharacterSheets.add(characterSheet);
        }
        return allCharacterSheets;
    }

    /**
     * The fetch function accepts an integer and returns a single characterSheet object with the id value given, or null
     * if no such characterSheet object exists
     * @param id the id number of a particular characterSheet object that is being fetched
     * @return the characterSheet object with the id that matches the id parameter, or null if no such characterSheet
     * has the id provided
     */
    @Override
    public CharacterSheet fetch(int id) {
        return  characterSheetRepository.findById(id).get();
    }

    /**
     * The delete function accepts an integer and deletes the characterSheet object with the id value given, if it exists
     * @param id the id number of a particular characterSheet object that is being deleted
     */
    @Override
    public void delete(int id) {
        characterSheetRepository.deleteById(id);
    }
}
