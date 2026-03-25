package org.example.abstractfactory.impl;

import org.example.abstractfactory.Skill;

public class Fireball implements Skill {
    @Override
    public void use() {
        System.out.println("Cast fireball");
    }
}
