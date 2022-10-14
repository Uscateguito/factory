package com.factorypattern.Model;

import com.factorypattern.Pattern.Animales;

public class Zorro implements Animales {

    @Override
    public void sonido() {
        System.out.println("What does the fox say?: dringuin dringuin dringuindringuidin");
    }
    
}
