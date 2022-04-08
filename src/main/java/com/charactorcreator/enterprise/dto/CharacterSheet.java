package com.charactorcreator.enterprise.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data
class CharacterSheet {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    private String characterName;
    private String characterBackground;
    private String characterClass;
    private String characterRace;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
}
