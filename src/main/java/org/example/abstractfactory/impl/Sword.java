package org.example.abstractfactory.impl;

import org.example.abstractfactory.Weapon;

public class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("Swing sword");
    }
}
