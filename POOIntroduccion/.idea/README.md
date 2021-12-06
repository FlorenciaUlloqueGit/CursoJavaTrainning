### Programación orientada a objetos

Programación orientada a objetos o entidades con características propias y comportameientos propios (habla de como se relacionan y como interactúan unos con otro)

# clase:
Molde donde se diseña o se forma un objeto. Nos permite definir cómo va a ser la entidad que vamos a crear. Los objetos son identificables y únicos en el sistema.
Objetos pueden ser iguales pero como entidad son distintos, son únicos en el sistema a pesar que sean similares a otros. cada objeto puede tener valores !=  respecto a otros objetos y se van a comportar distintos.
molde para formar la entidad, que es el objeto (la isntancia).


# Instancia 
automovil auto = new automovil();  crea un objeto de la clase que es el molde.


#Tips
- Estado de un objeto: valor que tienen los atributos de una instancia en cierto momento.
- get:obtener o leer /set = asignar o modificar.
- Modificadores de los atributos:
    - publicos: pueden acceder todos a estos atributos.
    - privados: solo puede acceder la misma clase.
    - protected:
    - -por defecto: solo del package.
    - final: no pueden modificarse en la herencia.Elñ atributo es una constante y no se puede modificar y se define en una clase.
    - static: dependen de la clase y no de los atributos. Se pueden llamar de forma dirtect sin crear la instancia porque dependen de la clase y no de la instancia.
- Sobrecarga de metodo: mismo nobmre del metodo pero diferente tipo o cantidad de parámetros.
- Encapsulamiento: abstraccion e implementacion que tiene le objeto segun sus metodos. Un objeto que usa otro objeto no sabe como esta implementado ni le interesa
- Ocultación: privte, protected, public 
- Polimorfismo: mismo comortamiento pero implementado de otra forma. Diferentes formas de hacer lo mismo.
- Enum: enumeradores, no son clases de java. sirven para enumerar cosas estaticas y son una coleccion de valores o atributos constantes