package com.factorypattern;

import com.factorypattern.Pattern.Animales;
import com.factorypattern.Pattern.AnimalesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnimalesFactory fabricaAnimal = new AnimalesFactory();

        // Obtener un objeto tipo perro y llamar a su método "Sonido"
        Animales perro = fabricaAnimal.getAnimal("Perro");
        perro.sonido();

        Animales gato = fabricaAnimal.getAnimal("Gato");
        gato.sonido();

        Animales zorro = fabricaAnimal.getAnimal("Zorro");
        zorro.sonido();
    }
}
