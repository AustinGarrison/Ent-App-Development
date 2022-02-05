package com.charactorcreator.enterprise;


import com.charactorcreator.enterprise.dto.CharacterSheet;
import com.charactorcreator.enterprise.service.ICharacterSheetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CharacterCreatorApplicationTests {

    @Autowired
    private ICharacterSheetService characterSheetService;
    private CharacterSheet characterSheet;

    @Test
    void contextLoads() {
    }

    @Test
    void getCharacterByID_returnsJohnForID1(){
        givenCharacterDataAvailable();
        whenSearchForCharacterID1();
        thenReturnJohnForID1();
    }

    private void givenCharacterDataAvailable() {
    }

    private void whenSearchForCharacterID1() {
        characterSheet = characterSheetService.getByID(1);
    }

    private void thenReturnJohnForID1() {
       String name = characterSheet.getCharacterName();
       assertEquals("John", name);
    }
    @Test
    void getCharacterStrengthByID_returns14forID1(){
        givenCharacterStatDataAvailable();
        whenSearchForStrength14ID1();
        thenReturnStrength14ForID1();
    }

    private void givenCharacterStatDataAvailable() {
    }

    private void whenSearchForStrength14ID1() {
        characterSheet = characterSheetService.getByID(1);

    }
    private void thenReturnStrength14ForID1() {
        int strength = characterSheet.getStrength();
        assertEquals(14, strength);

    }

}
