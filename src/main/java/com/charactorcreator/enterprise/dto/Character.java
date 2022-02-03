package com.charactorcreator.enterprise.dto;


import lombok.Data;

public @Data
class Character {
    private String characterName;
    private String characterBackground;
    private String characterClass;
    private String characterRace;
    private Attribute[] attributes;
}
