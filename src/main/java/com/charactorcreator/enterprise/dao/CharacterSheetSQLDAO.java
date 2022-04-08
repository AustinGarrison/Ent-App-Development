package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("characterSheetDAO")
@Profile({"dev", "default"})
public class CharacterSheetSQLDAO implements ICharacterSheetDAO {
    @Autowired
    CharacterSheetRepository characterSheetRepository;

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        CharacterSheet createdCharacterSheet = characterSheetRepository.save(characterSheet);
        return createdCharacterSheet;
    }

    @Override
    public List<CharacterSheet> fetchAll() {
        List<CharacterSheet> allCharacterSheets = new ArrayList<>();
        Iterable<CharacterSheet> characterSheets = characterSheetRepository.findAll();
        for (CharacterSheet characterSheet : characterSheets) {
            allCharacterSheets.add(characterSheet);
        }
        return allCharacterSheets;
    }

    @Override
    public CharacterSheet fetch(int id) {
        return  characterSheetRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        characterSheetRepository.deleteById(id);
    }
}
