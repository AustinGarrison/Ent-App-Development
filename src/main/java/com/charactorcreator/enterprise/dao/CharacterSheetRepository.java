package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("CharacterSheetRepository")
public interface CharacterSheetRepository extends CrudRepository<CharacterSheet, Integer>{
}
