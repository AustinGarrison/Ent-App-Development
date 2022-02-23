package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;

public interface ICharacterSheetDAO {
    CharacterSheet save(CharacterSheet characterSheet) throws Exception;

    CharacterSheet getById(int id);
}
