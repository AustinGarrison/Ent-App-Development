package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterSheet;

public interface ICharacterSheetService {
    /**
     * Get a character with an id.
     * @param id identifier for object
     * @return matching character, null if nothing matches
     */
    CharacterSheet getByID(int id);

    /**
     * Saves a CharacterSheet.
     * @param characterSheet a CharacterSheet object
     */
    CharacterSheet save(CharacterSheet characterSheet) throws Exception;
}
