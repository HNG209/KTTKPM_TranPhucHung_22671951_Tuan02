package org.example.factory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new MageFactory();
        Character character = characterFactory.createCharacter();
        character.attack();
    }
}
