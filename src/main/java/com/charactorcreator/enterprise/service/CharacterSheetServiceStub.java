package com.charactorcreator.enterprise.service;


import com.charactorcreator.enterprise.dao.ICharacterSheetDAO;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.stereotype.Component;

@Component
public class CharacterSheetServiceStub implements ICharacterSheetService{

    private ICharacterSheetDAO characterSheetDAO;

    public CharacterSheetServiceStub(){

    }

    public CharacterSheetServiceStub(ICharacterSheetDAO characterSheetDAO){

        this.characterSheetDAO = characterSheetDAO;
    }

    @Override
    public CharacterSheet getByID(int id) {
        CharacterSheet characterSheet = characterSheetDAO.getById(id);
        return characterSheet;
    }

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        return characterSheetDAO.save(characterSheet);
    }
}
