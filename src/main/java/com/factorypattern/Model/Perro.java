package com.factorypattern.Model;

import com.factorypattern.Pattern.Animales;

public class Perro implements Animales {

    @Override
    public void sonido() {
        System.out.println("guau");
    }
}
