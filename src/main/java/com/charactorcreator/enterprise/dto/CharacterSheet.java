package com.charactorcreator.enterprise.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="characterSheet")
public @Data
class CharacterSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "characterName")
    private String characterName;
    @Column(name = "characterBackground")
    private String characterBackground;
    @Column(name = "characterClass")
    private String characterClass;
    @Column(name = "characterRace")
    private String characterRace;
    @Column(name = "strength")
    private int strength;
    @Column(name = "dexterity")
    private int dexterity;
    @Column(name = "constitution")
    private int constitution;
    @Column(name = "intelligence")
    private int intelligence;
    @Column(name = "wisdom")
    private int wisdom;
    @Column(name = "charisma")
    private int charisma;
}
