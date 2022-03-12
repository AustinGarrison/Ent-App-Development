package com.charactorcreator.enterprise.service;


import com.charactorcreator.enterprise.dao.CharacterSheetRepository;
import com.charactorcreator.enterprise.dao.ICharacterSheetDAO;
import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class CharacterSheetServiceStub implements ICharacterSheetService{


    @Autowired
    ICharacterSheetDAO characterSheetDAO;

    @Autowired
    CharacterSheetRepository characterSheetRepository;

    public CharacterSheetServiceStub(ICharacterSheetDAO characterSheetDAO){
        this.characterSheetDAO = characterSheetDAO;
    }

    @Override
    public CharacterSheet fetch(int id) {
        return characterSheetDAO.fetch(id);
    }

    @Override
    public CharacterSheet save(CharacterSheet characterSheet) throws Exception {
        return characterSheetDAO.save(characterSheet);
    }

    @Override
    public Iterable<CharacterSheet> fetchAll(){
        return characterSheetDAO.fetchAll();
    }
    @Override
    @CacheEvict(value = "delete", key = "#id")
    public void delete(int id) {
        this.characterSheetRepository.deleteById(id);
    }
}
