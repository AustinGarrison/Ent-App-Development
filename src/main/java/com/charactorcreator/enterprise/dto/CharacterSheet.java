package com.charactorcreator.enterprise.dto;


import lombok.Data;

public @Data
class CharacterSheet {
    public int id;
    private String characterName;
    private String characterBackground;
    private String characterClass;
    private String characterRace;
    private CharacterAttribute[] attributes;
}
