package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterSheet;

import java.util.List;

public interface ICharacterSheetService {
    /**
     * Get a character with an id.
     * @param id identifier for object
     * @return matching character, null if nothing matches
     */
    CharacterSheet fetchByID(int id);

    /**
     * Saves a CharacterSheet.
     * @param characterSheet a CharacterSheet object
     * @return characterSheet the saved characterSheet object
     * @throws Exception if the application cannot connect to the database server
     */
    CharacterSheet save(CharacterSheet characterSheet) throws Exception;

    List<CharacterSheet> fetchAll();
}
