package com.charactorcreator.enterprise.dto;

import lombok.Data;

public @Data
class CharacterSheet {
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
