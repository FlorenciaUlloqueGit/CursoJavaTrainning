#Patrones de diseño
fragmentos de codigo o algoritmo que nos permiten resolver algun problema cotidiano que  se repite una y otra vez. 
Orientado a la POO. Resuelven un problema comun y corriente que se repite en la programación.
###Categorias
- Patrones creacionales: ej singleton
- Patrones estructurales:
- Patrones de diseño:


##Patrón Singleton:
Es creacional porque crea una instancia de un objeto. Permite crear una sola isntancia de una clase que es compartida para toda la aplicación. Se usa mucho para base de datos. La idea es restringir el constructor haciendolo privado asi no podemos crear mas de una clase.


##Patrón Abstract Factory
Es creacional al igual que el singleton porque crea objetos pero en este se crean familas de objetos que están relacionadas mediante la herencia o implementación de interfaces. Nos permite crear diferenes objetos que estan relacionados por parentezco, ya sea mediante la herencia o implementación de una clase más generica. Las fabricas crean los productos y los productos tienen varios tipos. Esta implementación debe ser escalable, que permita crear una nueva familia de productos y una nueva fábrica concreta con nuevos productos que va a implementar.
Hay dos partes: 
1. El producto o el objeto que vamos a crear: Los producto son los objetos que se van a crear. Son familias de objetos que en este patrón se conoce como el producto.
2. Las clases fábrica, las que crean la instancia: donde vamos a crear estos productos. Son metodos abstractos que tienen que implementar fabricas concretas, por elemplo FabricaConcreta1, FabricaConcreta2. Ejemplo: factoría windows,. factoria mac, factoria linux