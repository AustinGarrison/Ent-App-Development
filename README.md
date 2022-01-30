# Ent-App-Development
Final project for IT4050C
## Introduction
Reserved for introduction
## Storyboard
[Storyboard with clickable button](https://docs.google.com/presentation/d/1_0UgbMf1nwo57A1_PARowoYKrw10Et8TGhOD57-HoLU/edit?usp=sharing)

<img width="430" alt="Updated Character Creator" src="https://user-images.githubusercontent.com/47151930/151673126-4095c718-8aea-4f5a-b483-f66a3fadb0fd.png">

<img width="428" alt="Character List" src="https://user-images.githubusercontent.com/47151930/151673185-1565fb13-1450-4941-b861-d5f128d068c6.png">

## Functional Requirements
As a User
• I want to create a character for D&D without having to roll dice for attributes
• So that I can get into a quick game without spending a lot of time determining stats
• Given a character name and a character background
• When entered into the form and the attributes are calculated
• Then the form allows you to print the character sheet
• Given no character name or background
• When the form is filled out
• Then throw a user error saying that it needs a name and background to be able to print
As a User
• I want to click in one of the attributes and have it calculate a value based on the D&D ruleset
• So that the attribute value is random, and I don’t have to use dice to calculate
• Given a place to click to interact with
• When each attribute is selected
• Then it uses a random number generator to calculate two numbers from 1 to 20 twice and taking the higher of the two values
As a User
• I want to be able to save the character sheet tied to a login
• So that I can go back to this character sheet in the future and reprint if I want
• Given the ability to login
• When I log in
• Then it gives me the ability to save



## JSON Schema
{
  "charactersheet": [
    {
      "characterName": "name",
      "background": "background",
      "class": "class:",
      "race": "race",
      "attributes": [
        {
          "strength": 0,
          "dexterity": 0,
          "constitution": 0,
          "intelligence": 0,
          "wisdom": 0,
          "charisma": 0
        }
      ]
    }
  ]
}

