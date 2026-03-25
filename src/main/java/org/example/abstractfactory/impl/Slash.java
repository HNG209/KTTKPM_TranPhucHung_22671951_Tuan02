package org.example.abstractfactory.impl;

import org.example.abstractfactory.Skill;

public class Slash implements Skill {
    @Override
    public void use() {
        System.out.println("Slash attack");
    }
}
