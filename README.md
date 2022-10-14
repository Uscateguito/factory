# Factory method

*Información base tomada de: https://refactoring.guru/design-patterns/factory-method y de https://www.tutorialspoint.com/design_pattern/factory_pattern.htm*

## Problema

Imagine que está creando una aplicación para clonar animales.

Un proyecto inicial permite sólo la clonación de perros, así que la mayoría del código creado, está vinculado con
la clase "Perro".

Sin embargo después de un tiempo el proyecto se vuelve tan famoso que dueños de gatos quieren clonar a sus mascotas.

Como la mayoría del código estaba vinculado sólo con la clase "Perro", hacer cualquier cambio para agregar gatos requiere hacer 
cambios en todo el código, igualmente si después, se quisieran agregar zorros, tendría que volver a replantearse todo el código.

Como resultado final el código quedaría desordenado pues estaría lleno de condicionales para cambiar el comportamiento de la app
con base a la clase.

## Solución: Factory Method

Factory method es un patron de diseño que permite hacer la creación de nuevos objetos a partir de una clase creadora, de modo que
para crear un objeto ya no es necesario hacer lo siguiente:

Perro perrosky = new Perro();

en cambio:

Animales perrosky = fabricaAnimal.getAnimal("Perro");

___

Aunque en principio parezca trivial, hacer un cambio como este, permite generar con la clase factory en una nueva subclase y cambiar la manera en la que se ejecutan los métodos de la clase de animales con base a una subclase.

Como factor limitante, las subclases retornarán diferentes tipos de productos sólo si estos productos tienen en común una clase base o una **interfaz**.

Por ejemplo, un perro y un gato deben implementar la interfaz "Animales", la cual declara un método llamado sonido. Dado que caada clase hace un sonido diferente, la implementación de sonido cambia.

### Relaciones con otras clases

- Abstract factory es una fabrica de fábricas, de modo que utiliza de este patrón para su propia existencia.