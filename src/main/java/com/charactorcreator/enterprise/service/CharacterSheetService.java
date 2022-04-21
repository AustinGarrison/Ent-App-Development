package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dao.ICharacterSheetDAO;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CharacterSheetService implements ICharacterSheetService {
    @Autowired
    private ICharacterSheetDAO characterSheetDAO;

    @Override
    @Cacheable(value="characterSheet", key="#id")
    public CharacterSheet fetchByID(int id) {
        CharacterSheet foundCharacter = characterSheetDAO.fetch(id);
        return foundCharacter;
    }

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        return characterSheetDAO.save(characterSheet);
    }

    @Override
    @Cacheable("characters")
    public List<CharacterSheet> fetchAll() {
        return characterSheetDAO.fetchAll();
    }
}
