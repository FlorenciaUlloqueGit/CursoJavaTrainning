#Java Generics

Permite convertir clases e interfaces y hacerlas mucho ms genéricas.


En su esencia, el término genéricos significa tipos parametrizados. Los tipos parametrizados son importantes porque le permiten crear clases, interfaces y métodos en los que el tipo de datos sobre los que operan se especifica como parámetro. Una clase, interfaz o método que funciona con un tipo de parámetro se denomina genérico, como una clase genérica o método genérico.

. En resumen, los genéricos amplían su capacidad de reutilizar el código y le permiten hacerlo de forma segura y confiable.
Hacenuestras aplicaciones más seguras en todo lo que es conversiones de tipos de datos y traajar con distintos tipos que sean mucho mas genéricos.
Evita casteos y hace el código más reutilizable



Ejemplo método genérico: 

```
 public static <T>List<T> fromArrayToList(T[] c){
        return Arrays.asList(c) ;//el metodo asList recibe un arreglo y lo convierte en una lista
    } //Este metodo generico nos permite pasar por parametro cualquier clase y no solo una clase especificada por parámetro. lo hace más reutilizable.



//Uso del método genérico
  List <Cliente> clientesLista = fromArrayToList(clientesArreglo); //convierto el arreglo generico en uno específico
        List <Integer> enterosLista = fromArrayToList(enterosArreglo);

```
## Bounded generis:
Son genericos limitados segun un tipo de dato.
```
public static <T extends Number>List<T> fromArrayToList(T[] c){
return Arrays.asList(c) ;//el metodo asList recibe un arreglo y lo convierte en una lista
}


public static <T extends Cliente>List<T> fromArrayToList(T[] c){
return Arrays.asList(c) ;//el metodo asList recibe un arreglo y lo convierte en una lista
}


  public static void imprimirClientes(List< ? extends Cliente> clientes){
        clientes.forEach(System.out::println); // para que una lista acepte clases hijas de Cliente

    }
```

## Tips:

- Por convención ,dentro del diamante del ArrayList o de la List, los tipos geneéricos se escriben con cualquier letra en mayúscula.
