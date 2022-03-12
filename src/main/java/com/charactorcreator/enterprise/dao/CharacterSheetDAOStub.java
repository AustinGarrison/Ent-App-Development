package com.charactorcreator.enterprise.dao;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.HashMap;
import java.util.Map;

public class CharacterSheetDAOStub implements ICharacterSheetDAO {
    Map<Integer, CharacterSheet> allCharacters = new HashMap<>();

    @Autowired
    @Qualifier("characterSheetRepository")
    CharacterSheetRepository characterSheetRepository;

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) {
        return characterSheetRepository.save(characterSheet);
    }

    @Override
    public Iterable<CharacterSheet> fetchAll() {
        return characterSheetRepository.findAll();
    }

    @Override
    public CharacterSheet fetch(int id) {
        return characterSheetRepository.findById(id).get();
    }
}
