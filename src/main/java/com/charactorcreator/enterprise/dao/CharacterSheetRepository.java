package com.charactorcreator.enterprise.dao;

import com.charactorcreator.enterprise.dto.CharacterSheet;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
@Profile("!test")
public interface CharacterSheetRepository extends CrudRepository<CharacterSheet, Integer>{
}
