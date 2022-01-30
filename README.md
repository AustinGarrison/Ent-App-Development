# Ent-App-Development
Final project for IT4050C
## Introduction
Reserved for introduction
## Storyboard
[Storyboard with clickable button](https://docs.google.com/presentation/d/1_0UgbMf1nwo57A1_PARowoYKrw10Et8TGhOD57-HoLU/edit?usp=sharing)

<img width="430" alt="Updated Character Creator" src="https://user-images.githubusercontent.com/47151930/151673126-4095c718-8aea-4f5a-b483-f66a3fadb0fd.png">

<img width="428" alt="Character List" src="https://user-images.githubusercontent.com/47151930/151673185-1565fb13-1450-4941-b861-d5f128d068c6.png">

## Functional Requirements
As a User<br>
• I want to create a character for D&D without having to roll dice for attributes <br>
• So that I can get into a quick game without spending a lot of time determining stats <br>
• Given a character name and a character background <br>
• When entered into the form and the attributes are calculated <br>
• Then the form allows you to print the character sheet <br>
• Given no character name or background <br>
• When the form is filled out <br>
• Then throw a user error saying that it needs a name and background to be able to print <br>
As a User <br>
• I want to click in one of the attributes and have it calculate a value based on the D&D ruleset <br>
• So that the attribute value is random, and I don’t have to use dice to calculate <br>
• Given a place to click to interact with <br>
• When each attribute is selected <br>
• Then it uses a random number generator to calculate two numbers from 1 to 20 twice and taking the higher of the two values <br>
As a User <br>
• I want to be able to save the character sheet tied to a login <br>
• So that I can go back to this character sheet in the future and reprint if I want <br>
• Given the ability to login <br>
• When I log in <br>
• Then it gives me the ability to save <br>



## JSON Schema
{<br>
  "charactersheet": [<br>
    {<br>
      "characterName": "name", <br>
      "background": "background", <br>
      "class": "class:", <br>
      "race": "race", <br>
      "attributes": [<br>
        {<br>
          "strength": 0, <br>
          "dexterity": 0, <br>
          "constitution": 0, <br>
          "intelligence": 0, <br>
          "wisdom": 0, <br>
          "charisma": 0 <br>
        } <br>
      ] <br>
    } <br>
  ] <br>
} <br>

##Scrum Roles
Project Owner/Scrum Master/Dev Ops- Johnathan Otten <br>
UI Specialist - Sara Barnes <br>
Backend Specialist - Joeseph Schmidt <br>
UI/Backend - Austin Garrison <br>
