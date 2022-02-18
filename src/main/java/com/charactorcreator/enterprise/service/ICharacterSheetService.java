package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterSheet;

public interface ICharacterSheetService {
    /**
     * get a specimen with an id
     * @param id identifier for object
     * @return matching character, null if nothing matches
     */
    CharacterSheet getByID(int id);

    CharacterSheet save(CharacterSheet characterSheet) throws Exception;
}
