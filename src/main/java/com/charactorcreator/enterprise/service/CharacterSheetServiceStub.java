package com.charactorcreator.enterprise.service;


import com.charactorcreator.enterprise.dao.ICharacterSheetDAO;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterSheetServiceStub implements ICharacterSheetService{

    private ICharacterSheetDAO characterSheetDAO;

    public CharacterSheetServiceStub(){

    }

    public CharacterSheetServiceStub(ICharacterSheetDAO characterSheetDAO){
        this.characterSheetDAO = characterSheetDAO;
    }

    @Override
    public CharacterSheet fetchByID(int id) {
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setStrength(14);
        characterSheet.setId(1);
        characterSheet.setCharacterName("John");
        return characterSheet;
    }

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        return characterSheetDAO.save(characterSheet);
    }

    @Override
    public List<CharacterSheet> fetchAll() {
        return characterSheetDAO.fetchAll();
    }
}
