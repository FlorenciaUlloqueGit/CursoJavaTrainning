

# Api de colección de java 

## Colecciones: 
Almacenan objetos y los agrupan y tienen dos grandes tipos : Collection y Map y dentro de collection tenemos el list y los sets.
Los mapas son diccionarios para guardar objetos asociados a un nombre, a una llave.

- List: almacena objetos en una secuencia determinada. Son ordenadas y se pueden ordenar y permite almacenar objetos duplicados
- Set: no permite elementos duplicados y no mantiene el orden de sus elementos.
- Map: Almacenan información en base a parejas de llaves y valores. se asocian los elementos guardados a un identificador o nombres.

###Rama: 
- Dentro de la interfaz collection tenemos:
  - List: Dentro de List tenemos:
    - ArrayList: en vez de usar un arreglo usa vistas enlazadas, es rapido para agregar elememtos, siempre los agrega al final de la vista. no es ideal para manipular datos, para eso es mejor el linkedList.
    - LinkedList: Implementación de una lista enlazada. aceso rapido a traves del indice pero la manipuaclion de los objetos es mas deficiente. es facil agregar elementos en cualquier parte. se pueden manipúlar elementos en cualquier parte del arreglo. (pila y cola es rapido )
    - Vector: tiene un costo de rendimienta extra respecto a los demas.
  - Set
    - HashSet: no es ordenado, los elementops se agregan con el metodo add 
    - TreeSet: es ordenado pero no permite duplicado y per,mite implementar un comparador para personalizar el ordenamiento.
    - LinkedHashSet: trabaja con una lista enlazada y combina un hashset con una lista enlazada y combina el ortdenamiento
- Dentro de la interface MAP tenemos:
  - HashMap: usa el algoritmo hashcode, los nombres e idnetnficadores son unicos
  - LinkedHashMap:
  - TreeMap: es un mapa ordenado.

## Métodos de Collection

- boolean ad (Object): agrega un elemento a la colección y devuelve false si no se pudo agregar.
- boolean addAll(Collection): Agrega una colección que se pasa por argumento.
- void clear(): Elimina todos los elementos que componen la colección.
- boolean contains(Object): verdadero si la colección contiene el objeto que se pasa como parámetro. Usa el método equals() para ubicar el objeto.
- boolean isEmpty() : verdadero si la colección está vacía y no contiene elementos.
- iterator iterator(): devuelve un objeto iterator que se puede utilizar para avanzar a través de los elementos.
- boolean remove(Object): elimina un objeto y devuelve true.
- boolean removeAll(collection): elimima todos los elementos que están contenidos en el argumento.
- boolean retainAll(Colection): Mantiene solo los elementos que están contenidos en el argumento , es lo que sería una intersección en la teoría de los conjuntos. verdadero si se produjo algún cambio.
- int size(): devuelve el numero de elementos que componen la colección.
- Object[] toArray()
- addfirst(), AddLast(), getFirst(), getLast() y removeLast(): no estpán definidos en ninguna interfaz y permiten utilizar la lsita enlazada copmo una pila o cola.
- getFist(), getLast(), removeLast(), removeFirst() lanzan NoSuchElementexception si la lista está vacía.

### Tips:
