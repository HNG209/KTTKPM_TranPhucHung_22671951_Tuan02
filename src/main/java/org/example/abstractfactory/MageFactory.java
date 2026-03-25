package org.example.abstractfactory;

import org.example.abstractfactory.impl.Fireball;
import org.example.abstractfactory.impl.Staff;

public class MageFactory implements CharacterFactory {
    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Skill createSkill() {
        return new Fireball();
    }
}
