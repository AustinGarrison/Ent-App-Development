package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.stereotype.Component;

@Component
public class CharacterSheetServiceStub implements ICharacterSheetService{
    @Override
    public CharacterSheet getByID(int id) {
        CharacterSheet characterSheet = new CharacterSheet();
        characterSheet.setId(1);
        characterSheet.setCharacterName("John");
        return characterSheet;
    }
}
