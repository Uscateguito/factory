package com.factorypattern.Pattern;

import com.factorypattern.Model.Gato;
import com.factorypattern.Model.Perro;
import com.factorypattern.Model.Zorro;

public class AnimalesFactory {
    
    // Método para obtener el tipo de animal
    public Animales getAnimal(String clase) {

        if(clase == null) return null;

        if(clase.equalsIgnoreCase("Perro")) return new Perro();

        if(clase.equalsIgnoreCase("Gato")) return new Gato();

        if(clase.equalsIgnoreCase("Zorro")) return new Zorro();

        return null;

    }
}
