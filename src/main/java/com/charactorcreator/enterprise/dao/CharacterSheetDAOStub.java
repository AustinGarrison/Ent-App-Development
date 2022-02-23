package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;

import java.util.HashMap;
import java.util.Map;

public class CharacterSheetDAOStub implements ICharacterSheetDAO{
    private Map<Integer, CharacterSheet> allCharacterSheets = new HashMap<>();

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        Integer id = characterSheet.getId();
        allCharacterSheets.put(id, characterSheet);
        return characterSheet;
    }

    @Override
    public CharacterSheet getById(int id) {
        return allCharacterSheets.get(id);
    }
}
