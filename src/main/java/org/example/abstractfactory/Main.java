package org.example.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new WarriorFactory();

        Weapon weapon = factory.createWeapon();
        Skill skill = factory.createSkill();

        weapon.use();
        skill.use();
    }
}
