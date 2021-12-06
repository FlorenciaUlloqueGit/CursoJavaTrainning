### interface
es una coleccion de metodos abstractos (sin implementar ) y de valores constantes que pueden realizar un objeto determinado
Es similar pero no es igual a una clase abstracta, no se pueden tener metodos implementados .
Captura similitudes entre clases no relacionadas sin forzar una relación entre ellas.
Definen comportamientos que una o varias clases necesitan implementar. Es un tipo de dato de referencia, puede usarse como tipo de dato del objeto (argumento de métodos y una declaración de variables).
con las interfaces agrupamos objetos que hacen cosas similares.

## Diseño orientado a interfaces
En java las interfaces permiten pasar del estilo de diseño "orientado a la implementación" a uno "orientado a la interfaz".
todas las clases acceden a servicios a través de interfaces que son implementadas por clases concretas y al no depender de clases concretas (solo de entidades abstractas) el diseño es más reutilizable.

## Herencuia Múltiple
Otra caracteristica de las interfaces es que soporta la herencia múltiple. Una clase puee implementar varias interfaces, no solo una como es en el caso de las clases.
ejemplo:
```
Public class Perro implements IPuedeSaltar, IPuedeCorrer, IPuedeNadar{
        @Override
        public void saltar(){
            //el perro puede saltar
        }

        @Override
        public void Correr(){
        //el perro puede saltar
        }

    @Override
        public void nadar(){
        //el perro puede saltar
        }

}
```

## ejemplo:
```
public interface Imprimible{
    public void Imprimir();
}
public class Curriculum implements Imprimible{
    
@Override
    public void Imprimir(){
//imprimiendo el cv
    }
}

  
public class Foto implements Imprimible{

    @Override

    Public void imprimir(){
//imprimiendo una foto
    }
}
```
### Tips
- las declaraciones de interfaces siempre son publicas o default
- Las interfaces reunen objetos que hacen lo mismo , mediante un protocol de implementación
- para implementar una interface en una clase se debe agregar implements: "public class Curriculo extends Hoja implements Imprimible"{
- Sirve para clases que tienen el mis mo com´portamiento pero que no heredan de la misma clase. ej: un murcielago puede volar, un helicoptero tambien y uno depende de la calse animal y otro de la clase Aviones
- Default en un método de la interfaz : sirve para especificar queno todas las clases deben tener que implementar ese metodo. Si no es default y no se implementa en la clase, va a mostrarse un error.
- Si el método es default debe tener cuerpo:
 ```
public interface Imprimible {
     default String imprimir(){
          return "Imprimiendo valor por defecto";
     }
 ```
- Los metodos de la interfaz pueden ser public, default y static