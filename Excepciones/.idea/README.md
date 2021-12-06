# Manejo de errores
Es común que al crear programas ocurran errores, por eso java usa las excepciones.
Una excepción es un problema o evento que ocurre durante la ejecución del programa que interrumpe el flujo normal de este. 
las excepciones en java son un tipo especial de objeto que nos proporcionan una forma simple y desacoplada del manejo de errores.

## Características:
- Separa el código que gestiona los errores del código principal del programa.
- Nos permite manejar el error y continuar con la ejecución del programa
- Permite agrupar y diferenciar entre diferentes tipos de errores.
- .Propaga errores hacia arriba en la pila de llamadas (StarkTrace)


## Try Catch Finally 
Estructura que nos permite capturar excepciones, reaccionar a un error de ejecución e imprimir mensajes de error a la medida y continuar con la ejecución del programa.
```
try{
[bloque que lanza la excepción
} catch(Exception e){
[aca manejamos el error]
} finally {
 [bloque opcional, siempre se ejecuta
}
```

## cómo funciona una excepción
Cuando se lanza una Excepición lo que  se hace es lanzar una instancia de excepcion o de una clase derivada. Esta clase tiene dos constructures y dos métodos importantes

Exception e = new Exception();

String mensaje = "Algun mensaje de error";
Exception e = new Exception(mensaje);

String mensaje = e.getMessage();
e.printStackTrace(); //imprime la pila complñeta de las excepciones desde donde ocurre el error hasta el primer método donde comienza la llamada del método. Detecta dodne se origina el error.

##Tipos de Excepciones:

- Chequeadas : de la clase excepction, estan obligadas al manejo de errores (try, catch). Obligan en tiempo de ejecucipón a manejar en el ide el error (Exception, sqlException, IoException, etc). Las chequeadas se usan cuando nuestra aplicación se puede recuperar del error y continuar con el flujo.
- No chequeadas: de la clase ruintime exception y su descendencia y no se encuentran obligadas a hacer manejo de errores, porque el error se lanza en tiempo de ejecución. (runtimeExeption, ClasscasException, NumberFormatException, ArrayIndexOutBoundsException, AritmethicException NullpointerException). Se usan cuando la aplicación no se puede recuperar del error.

## Cláusula throws
Los métodos deben capturar o propagar todas las excepciones chequedas que puedan ser lanzadas dentro de su ámbito. Esto es una cláusula throws que lista una o varias excepciones que son lanzadas en el método. Esta sentencia requiere un solo argumento, el objeto Throwable
```
try{
public cliente porId(int id)throws Exception{
 (...)
}
```

## Crear clases de Excepciones
Se pueden crear clases de excepciones e incluso realizar herencia de excepciones. En el siguiente ejemplo se crea e implementa una excepción.


```
public class PersonalizadaException extends Exception{
    public PersonalizadaException(String mensaje){
        super(mensaje);
    }
}
```
```
public class ClienteRepositorio{
    public Cliente porId(int id) throws PersonalizadaException{
    if(id==0)
{
        throws new PersonalizadaException(super("id no puede ser cero");
          }
       }
    }
       
```


### Tips:
- NumberFormatException : verica que el valor sea solo numérico (salta ej si le paso un string)
- ArithmeticException: salta cuando hay una excepción aritmética : ejemplo si divido por 0.
- Para obtener el mensaje del error e.getMessage();




