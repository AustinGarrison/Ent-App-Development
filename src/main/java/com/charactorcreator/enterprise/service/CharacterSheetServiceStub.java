package com.charactorcreator.enterprise.service;

import com.charactorcreator.enterprise.dto.CharacterAttribute;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.stereotype.Component;

@Component
public class CharacterSheetServiceStub implements ICharacterSheetService{
    @Override
    public CharacterSheet getByID(int id) {
        CharacterSheet characterSheet = new CharacterSheet();
        CharacterAttribute attribute = new CharacterAttribute();
        attribute.setStrength(14);
        characterSheet.setId(1);
        characterSheet.setCharacterName("John");
        characterSheet.setAttributes(attribute);
        return characterSheet;
    }
}
