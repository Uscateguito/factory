package com.factorypattern.Model;

import com.factorypattern.Pattern.Animales;

public class Gato implements Animales {

    @Override
    public void sonido() {
        System.out.println("miau");        
    }
    
}
