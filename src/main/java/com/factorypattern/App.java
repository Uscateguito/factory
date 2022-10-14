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
        Animales perrete = fabricaAnimal.getAnimal("Perro");
        perrete.sonido();

        Animales gatete = fabricaAnimal.getAnimal("Gato");
        gatete.sonido();

        Animales zorrete = fabricaAnimal.getAnimal("Zorro");
        zorrete.sonido();
    }
}
