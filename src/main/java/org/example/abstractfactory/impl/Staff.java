package org.example.abstractfactory.impl;

import org.example.abstractfactory.Weapon;

public class Staff implements Weapon {
    @Override
    public void use() {
        System.out.println("Use magic staff");
    }
}
