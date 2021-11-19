# Matrices

Las matrices son arreglos bidimensionales, donde cada uno de sus elementos es a su vez un arreglo en su segunda dimensión.
Esto permite que  no todos los elementos tengan el mismo tamaño y , de esta forma, es posible crear matrices recursivas y multidimensionales.
Son arreglos de arreglos. en vez de ser de un tipo (string int) son del tipo arreglos. 
su representación es como una tabla, con filas y columnas.


 Primer elemento: [0] [0] =fila 0 columna 0. --> sino 0,0
 - siempre comienzan en 0.
###Declaración e instanciación:
  la declaración de iuna matriz tiene dos partes: el tipo de dato seguido de doble corchete y el nombre de la variable:
   - int numeros [][];
Debe incluir el tipo de dato que va a contener.
   - Se usa el operador new al crear la matriz mas el tipo de los elementos mas el núm de filas y col.
```
int [][] numeros = new int [fila] [col];
// ej: int[][] numeros = new int [2][3];

```
### Tamaños de filas y columnas
Como en los arreglos, podemos obtener el tamaño de la matriz con el atributo lenght, tanto para filas y columnas.
```
int[][] numeros = new int[2][3];
System.out.println("numeros de filas = " + numeros.lenght);
System.out.println("numeros de columnas = " + numeros[0].lenght);
```
### Declaración e instanciación
No solo podemos almacenar elementos del tipo primitivo, sino tambien del tipo de referencia, es decir objetos.
```
Producto[][] productos = new Producto[2][2];
String[][] nombres = new String[3][2];
```
###Inicialización de elementos:
Asignamos elementos en la matriz indicando la llave o índice de la fila y de la col.

int[][] numeros = new int [2][4];
```
numeros[0][0] = 1;
numeros [0][1] = 2;
numeros [0][2] = 3;
numeros [0][3] = 4;
```
###Obtener elementos
int num1 = numeros[0][1];
int num2 = numeros [1][2];

Producto mesa = productos[1][2];

### Declaración, isntanciación e inicialización de una matriz
Se usa cuando conocemos los elementos y el tamaño de la matriz.

int[][] numeros = {{1,2,3,4}, {11,23,13,14}};

Producto [][] productos = {
    {new Producto("Mesa comedor"), new Producto("tv sony led")},
    {new Producto("bicicleta"), new Producto("bici electrica")},
};
                            //fila 1         //fila 2           //fila 3
String [][] nombres = {{"pepe", "María"}, {"Pato", "Vera"}, {"Julio", "Mauro"}}


### Recorrer una matriz usando for
```
for(int i = 0; i<nombres.lenght; i++){
    for(int j = 0; j<nombres[i].lenght; j++){
    System.out.println("nombre = " + nombres[i][j]);
    }
}
```
### Recorrer una matriz usando foreach
```
for(String[]fila : nombres){
    for(String columna:fila){
    System.out.println("nombre = " + columna);
    }
}
```


###Tipos de matrices
- Matriz simétrica: si es igual a su transpuesta, si en diagonal los valores son iguales como un espejo
- Matriz transpuesta : matriz donde se transponen las filas en las columnas y las columnas en las filas. (las filas pasan a ser columnas y las columnas pasan a ser filas)
- Matriz identidad: matriz cuadrada en donde todos sus elementos son 0 menos los elementos de la diagonal. el producto de cualquier matriz por la matriz identidad no tiene niungún efecto.
## Tips
- las matrices no crecen, son estaticos y no dinámicos
- 