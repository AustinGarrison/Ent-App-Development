package com.charactorcreator.enterprise.dao;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
@Profile("test")
public class CharacterSheetDAOStub implements ICharacterSheetDAO {
    //creates a map of CharacterSheet
    Map<Integer, CharacterSheet> allCharacters = new HashMap<>();

    /**
     *
     * @param characterSheet
     * this method saves each character sheet
     * @return CharacterSheet Object
     * @throws Exception
     */
    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        allCharacters.put(characterSheet.getId(), characterSheet);
        return characterSheet;
    }

    @Override
    public List<CharacterSheet> fetchAll() {
        List<CharacterSheet> returnCharacterSheets = new ArrayList(allCharacters.values());
        return returnCharacterSheets;
    }

    @Override
    public CharacterSheet fetchById(int id) {
        return allCharacters.get(id);
    }

    @Override
    public void delete(int id) {
        allCharacters.remove(id);

    }
}
