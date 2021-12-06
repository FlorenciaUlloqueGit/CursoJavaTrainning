# Herencia
Es el mecanismo de la programacióm orientada a objetos para implementar relaciones de jerarquia de clases.
una subclase hereda el estado y el comportamiento de todos sus ancestros. Es una de las bases de reutilización de código y polimorfismo y un principio fundamental de la POO
para aplicar la herencia debe haber una relacion familiar de parentezco entre las coases y no se debe usar solo para reutilizar codigo si esa condicipion no se cumple
Superclase: clases que heredan de una clase padre.
Superclase: clase que es el ancestro mas directo de una clase.
Se heredan los atributos protyegidos y no protegidos de la clase padre.

##Formas de herencia:
-Generalización: se lleva el codigo en comun a una clase general y las clases hijas heredan del padre. a partir de las hijas dse llega al padre
- Especialización: cuando temnemos una clase y despues necesitamos una muy similar, derivamos a una clase mas especializada. (ej persona-alumno)


### Palabra super:
palabra reservada de la herencia y refiere que una clase hija puede reusar atributos de la clase padre invoca al contructor del padre 




La herencia permite sobrescribir un método que heredamos del padre, se puede hacer redefiniendo en la clase hija un método con el mismo nombre.

### Restringir la herencia y sobreescritura de métodos:
PAra impedir la herencia usamos la palabra final:
```
final public class Persona{
};

final public void metodoDelPadre()
{
}
```

## Formas de asignar herencia:
public class Alumno extends Persona {

}

### Modificador final
Sirve para evitar la herencia ,que un metodo se sobrescriba en una clase hija  o que una clase herede . Evita y restringe la herencia.

ejemplo: 

public  final class AlumnoInternacional  //esta clas no puede tener clases hijas


