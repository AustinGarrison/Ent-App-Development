package com.charactorcreator.enterprise;


import com.charactorcreator.enterprise.dao.ICharacterSheetDAO;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import com.charactorcreator.enterprise.service.CharacterSheetServiceStub;
import com.charactorcreator.enterprise.service.ICharacterSheetService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CharacterCreatorApplicationTests {

    @Autowired
    private ICharacterSheetService characterSheetService;
    private CharacterSheet characterSheet;

    @MockBean
    private ICharacterSheetDAO characterSheetDAO;

    @Test
    void contextLoads() {
    }

    @Test
    void getCharacterByID_returnsJohnForID1() throws Exception{
        givenCharacterDataAvailable();
        whenSearchForCharacterID1();
        thenReturnJohnForID1();
    }

    private void givenCharacterDataAvailable() throws Exception {
        Mockito.when(characterSheetDAO.save(characterSheet)).thenReturn(characterSheet);
        characterSheetService = new CharacterSheetServiceStub(characterSheetDAO);

    }

    private void whenSearchForCharacterID1() {
        characterSheet = characterSheetService.fetch(1);
    }

    private void thenReturnJohnForID1() {
       String name = characterSheet.getCharacterName();
       assertEquals("John", name);
    }
    @Test
    void getCharacterStrengthByID_returns14forID1() throws Exception{
        givenCharacterDataAvailable();
        whenSearchForStrength14ID1();
        thenReturnStrength14ForID1();
    }



    private void whenSearchForStrength14ID1() {
        characterSheet = characterSheetService.fetch(1);

    }
    private void thenReturnStrength14ForID1() {
        int strength = characterSheet.getStrength();
        assertEquals(14, strength);

    }

    @Test
    void saveCharacter_validateReturnCharacterWithRaceAndDexterity() throws Exception {
        givenCharacterDataAvailable();
        whenUserCreatesNewCharacterAndSaves();
        thenCreateNewCharacterRecordAndReturn();
    }

    private void whenUserCreatesNewCharacterAndSaves() {
        characterSheet.setCharacterRace("Elf");
        characterSheet.setDexterity(15);
    }

    private void thenCreateNewCharacterRecordAndReturn() throws Exception {
       CharacterSheet createdCharacterSheet = characterSheetService.save(characterSheet);
       assertEquals(characterSheet, createdCharacterSheet);
    }

}
