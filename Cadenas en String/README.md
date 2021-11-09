# Qué es un String:
Los strings son objetos de java del tipo referencia 


formato: 
```

String nombre = new String("Andrés);
```
no hace falta poner el new String para crear un String a pesar de que es una clase.
tPodemos decir que es un arreglo. Es un objeto yno un primitivo.
- se codifican en la tabla unicode. 
- son inmutables.

## concatenar strings
se concatena con el símbolo más. 

## comparar Strings:
con el operador relacional de == compara por referencia y con Equals() compara por el valor

```
System.out,printl("tienen el mismo valor? + str1.equals(str2));
```
 -- permite saber si las cadenas tienen el mismo caracter mientras que el otro compara dos objetos diferentes (el ==) entonces da false.

 ## Métodos de la clase String:
 - int lenght(): para saber la cant de caracteres.
 - boolean equals(String b): compara si ambos son iguales por valor.
 - booloean equalsIgnoreCase(String b): compara si ambas son iguales independientemente de mayus y minus.
 - int compareTo(String b): Compara contra la cadena del argumento devolviendo: 
    . un valor negativo si la cadena es anterior a b.
    -  0 si es igual.
    -  un valor psoitivo si la cadena es posterior a b.
- String trim(): crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final.
- char charAt(oint posicion): extrae un caracter en la pos indicada.
- char[]toCharArray(): convierte la cadena en un arreglo de caracteres.
- String substring(int a, int b): extrae la subcadena entre las pos a y b.
- String substring (int desde) extrae la subcadena desde la pos indicada.
- int indexOf(String cadena); indica en qué posición se encuentra el caracter (o cadena) indicado por primera vez, buscando desde el principio.
- int lastIndexOF(String cadena): indica en qué pos se encuentra el caracter o cadena indicado x 1era vez, buscando desde el final.
- boolean startswith (String prefijo): dice si la cadena comienza con el prefijo indicado.
- boolean endsWith(string prefijo): dice si la cadena termina con el prefijo indicado.
- String[] split(String patron): Divide la cadena en varias subcadenas utilizando el patrón indicado como separador.

### con String creamos un objeto de la clase String y se lo asignamos a una variable.


# Tips:
- Detalle = nombreVariable.concat(String2) //concatena y retorna una instancia nueva.
- String Builder es el que permite concatenar.
- El método concat es mas rápido por lejos que el + ; No acepta nulos, a diferencia del metodo de concatenar con + 
- StringBuilder: permite crear un String y empezar a anexar con el método appen y con toString() generamos el Stirng completo. ES mutable a diferencia del String común. es el mpás rápido de todos.
- variable.isEmpty() //es vacio 
- cvariable.lenght(0) ((/vacío))
- variable.isBlank() -> valida que este vacío, nulo y con solo espacios en blanco. //+ restrictivo que los anteriores.
- en EJEMPLOSTRINGMETODO hay muchos ejemplos de metodos con variables.

