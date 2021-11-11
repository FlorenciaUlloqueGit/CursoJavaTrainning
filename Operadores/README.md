# Operadores en java:

sirven para realizar cálculos, comparar valores, unir identificadores, y literales, formatear expresiones lógicas , toma de decisiones, etc.
## tipos de operadores: 
- Aritméticos, 
- Relacionales, 
- Lógicos
-Asignación

### Operadores aritméticos:
- se usan para realizar operaciones aritméticas simples en tipos de datos primitivos.
- multiplicacion *.
- división /.
- módulo o resto %.
- suma +.
- resta - .
- decremento --.
- incremento ++.
menos unario -.

### Operadores combinados:
Simplifican una expresión
- -=
- +=
- /=
- *=
### Operador incremento y decremento.
Se usa para incrementar o decrementar el valor en 1.   
  Hay dos variedades de operadores de incremento pre y post.
  - ++a: Preincremento: Incrementa a en uno y luego devuelve a.
  - a++ post incremento: devuelve a y luego incrementa en 1.
  - --a Post-decremento: Decrementa a en uno y luego devuelve a.
  - a-- PostDecremento: Devuelve a y luego decrementa a en uno.
 
 ### Operador Ternario o condicional
 Versión abreviada de la sentencia if-else. Tiene 3 operadores y por eso se llama ternario.
    ```
    (condición)? valor1: valor2
    ```
    si la condición se cumple devuelve el primer valor y , en caso contrario el segundo.
      Ejemplo:
      ```
      int a = 2>3?1:2;
      ```
### Operadores relacionales:
Se usan para comprobar relaciones de igualdad, mayor qyue, menoir que . Devuelven un resultado booleano despues de la comparación
- a>b
- a>=b
- a<b
- a<=b
- a == b
- a!=b
### Operadores lógicos:
Permiten evaluiar expresiones lógicas y trabajan con operandos booleanos. Realizan las operaciones lógicas AND, OR  y not.
- And: &&. (verdadero cuando a y b son verdadersos. Evaluación condicional que evalua primero a al 1era variable y despues a la otra si la primera es v)
- Or: || (verdadero cuando a o b son verdadersos. Evaluación condicional)
- not: ! (verdadero si A es falso)
- and: & (verdadero cuando a y b son verdaderos. Siempre evalúa ambos operandos)
- or: | (verdadero cuando a o b son verdaderos. Siempre evalúa ambos operandos)
- Xor:  ^ (verdadero cuando a y b son diferentes)



## tips:
- el and siempre tiene prioridad sobre el or. si se quiere cambiar esto se usa paréntesis.
- Operadores ternarios: Formados por 3 elementos.  Es como una version abreviada del if/else
    -  Primera parte del ternario : condición.
    - Segunda parte: resultadoTrue;
    - Tercera parte: Resultado false;
    ```
     estado = promedio >= 6?"aprobado": "rechazado";
        System.out.println("estado = " + estado);
     ``` 
     - TODA clase hereda de la clase Object. 
     ### OPERADOR InstanceOf:

     Refiere a una instancia de algo. explicita que algo proviene de algo, o es del tipo algo 
     ```
     int num = 0;
     b1 = num instanceof Number;
     (es true)
     ```

