# Arreglos
Son tipos de datos de referencia que contienen varios elementos ordenados, es una coleccion.
Sus elementos o valores están asociados a una llave o índice y puede contener tipo de referencia o primitivos.
  Siempre se encuentran asociados a un solo tipo de datos. Recordar: Comienzan en el índice cero. Tienen un tamaño fijo y un tipo de dato específico.

## Declaración:
El arreglo se encuentra formado por dos partes:
- el tipo de dato del arreglo + corchete.
- el nombre de la variable. (recomendado ponerlo en plural)

```
int []numeros;
int [] numeros = new int[3];
```
Cuando se crea un array se usa el operador new mas el tipo de los elementos mas el [número de elementos]
  No solo podemos almacenar elementos del tipo primitivo, sino también del tipo de referencia (objetos).
```
Producto [] productos = new Productos[3];
String [] nombres = new String[5];
```
### Declaración e instanciación:
La declaración de un arreglo tiene dos partes: El tipo de datos del arreglo seguido de corchetes y el nombre de la variable.
```
int []numeros;
```
Un tipo de array incluye el tipo de dato de los elementos que va a contener. 
Cuando se crea un array se usa el operador new mas el tipo de los elementos mas el num de elementos.
```
int [] numeros = new int[3];
```
### Inicialización de elementos 
- Asignamos elementos mediante la llave o índice:
```
int [] numeros = new int[3];
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
```
En objetos:
```
Producto[] productos = new Producto[3];
productos[0] = new Producto("Mesa comedor");
productos[1] = new Producto("TV sony Led");
productos[2] = new Producto("Bicicleta oxea");
```
### Lectura de arreglos
Se accede a través del índice del arreglo.
```
int num1 = numeros[0];
int num1 = numeros[1];
int num1 = numeros[2];
```
### Declarar, instanciar e inicializar el arreglo en un paso (con llaves)
Se usa cuando ya sabemos la cantidad de elementos que va a contener el arreglo.
No es dinámico y es menos flexible.
```
int[] numeros = {1,10,3}; //es igual que decir numeros[1] = 10;

```
## Recorrer un arreglo usando for
```
String [] nombres = {"María", "José", "Juan"};
for(int i = 0; i < nombres.lenght; i++){
 System.out.println("nombre = " + nombres[i]);
 }
```
### Recorrer un arreglo usando foreach
```
String [] nombres = {"María", "José", "Juan"};
for(String nom: nombres){
 System.out.println("nombre = " + nom);
 }
```


###Tips 
- Arrays.sort(productos) : ordena el array alfabeticamente o los numeros de mayor a menor
- Collections.reverse(Arrays.asList(nombreArreglo)); //revierte el orden de los índices del arreglo de atrás para adelante.
- Para copiar un arreglo: System.arraycopy(nombreArregloACopiar , DesdePosicionArregloACopiar(0), nombreNuevoArreglo, desdePosicionArregloNuevo, hastaDondeNuevoArreglo);
```
        System.arraycopy(numeros , 0, arregloDeArreglo, 0, arregloDeArreglo.length );
```