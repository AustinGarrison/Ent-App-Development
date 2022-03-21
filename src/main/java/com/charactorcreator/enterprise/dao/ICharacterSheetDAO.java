package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;

import java.util.List;

public interface ICharacterSheetDAO {
    CharacterSheet save(CharacterSheet characterSheet) throws Exception;

    List<CharacterSheet> fetchAll();

    CharacterSheet fetch(int id);

    void delete(int id);
}
