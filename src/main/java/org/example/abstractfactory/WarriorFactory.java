package org.example.abstractfactory;

import org.example.abstractfactory.impl.Slash;
import org.example.abstractfactory.impl.Sword;

public class WarriorFactory implements CharacterFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Skill createSkill() {
        return new Slash();
    }
}
