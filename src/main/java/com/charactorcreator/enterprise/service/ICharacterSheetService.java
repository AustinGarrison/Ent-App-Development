package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterSheet;

public interface ICharacterSheetService {
    /**
     * get a specimen with an id
     * @param id identifier for object
     * @return matching character, null if nothing matches
     */
    CharacterSheet getByID(int id);

    /***
     * Save a character.
     * @param CharacterSheet to be saved
     * @return Saved CharacterSheet
     * @throws Exception
     */
    CharacterSheet save(CharacterSheet characterSheet) throws Exception;
}
