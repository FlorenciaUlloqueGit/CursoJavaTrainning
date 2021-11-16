#Flujos  de control:

- if/else: ejecuta un bloque de codigo si alguna condición es verdadera. El bloque else no es necesario y las llaves tampoco al menos que usemos else.
```
if(expresión) {
} else if (expresion) {
//bloque a ejecutar si no se cumple la condicion y se comple la nueva
} else {
}

```
- switch: se usa para realizar sentencias condicionales basadas en algula expresión. De acuerdo al valor de la expresión se ejecuta la sentencia case apropiada. 
La expresión solo acepta tipos String, int, char,short y byte.
Si la expresión no se cumple en nungun case se ejecuta el case por default. La sentencia brak hace que el control salga de la sentencia switch y continue con la siguiente línea.
```
switch(variable) {
case valor1:
    //ejecuta sentencia 1
    break;
case valor2: 
    //ejecuta la sentencia 2
    break;
case valor3:
    //ejecuta la sentencia 3
    break;
default:
    //se ejecuta esta sentencia si no hay coincidencias en un case anterior.
}
```
- While: Ejecuta un bloque de código mientras se cumpla la condición. primero evalúa la condición y despues se fija que secumpla.
```
while(condicion) {
//ejecuta el bloque 
}
```
- DoWhile: parecido al while pero primero ejecuta el bloque y despues evalua la condición. Se ejecuta al menos una vez.
```
do {
//ejecuta el bloque 
} while (expresión);
```
- for: se usa cuando se conocen los límites del bucle, es decir cuandoc comienza y cuando termina. Se determina cuánto va a iterar. 
```
for (inicialización; condición; incremento){
//ejecuta el bloque
} 
```
# Separadores
 Son caracteres con un significado especial:
 - **() :** Se usan para contener condiciones en sentencias de flujo de control. Contienen listas de parámetros, tanto en la definición de un método como en la llamada al mismo.También se usan para modificar la precedencia en una expresión y para realizar conversiones de tipo.
 - **{} :** Se usan para definir bloques de código, definir ámbitos y contener valores iniciales de los arreglos.
 - **[] :** Se usa para declarar arreglos o matrices como apra referenciar valores dentro de los mismos.
 - **; :** Separa sentencias y se usa para encadenar sentencias dentro de un for.
 - **; :** Separe identificadores consecutivos en la declaración de variables y en las listas de parámetros de un método.
 - **. :** Separa un nombre de atributo o método de una variable de referencia a objeto. También separa nombre de paquete de los de un subpaquete o una clase.


## TIPS:
- no hacen falta los {} en if y else cuando dentro de cada uno hay solo una línea de ejecución, pero es una buena practica hacerlo.
- El break sale del switch o del bucle.
- Se puede etiquetar un for poniendo String nombreEtiqueta : bucle.
```
   bucle1:
        //etiqueta para el for
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1; //se salta el 2

                }
                System.out.println("[i = " + i + ", j = " + j + "],");

            }
  
```
- continue adentro de un for en una condición if: saltea lo que se ingresa en la condición. (Profundizar). 