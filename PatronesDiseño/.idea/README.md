#Patrones de diseño
fragmentos de codigo o algoritmo que nos permiten resolver algun problema cotidiano que  se repite una y otra vez.
Orientado a la POO. Resuelven un problema comun y corriente que se repite en la programación.
###Categorias
- Patrones creacionales: ej singleton
- Patrones estructurales:
- Patrones de diseño:


##Patrón Singleton:
Es creacional porque crea una instancia de un objeto. Permite crear una sola isntancia de una clase que es compartida para toda la aplicación. Se usa mucho para base de datos. La idea es restringir el constructor haciendolo privado asi no podemos crear mas de una clase.


##Patrón Abstract Factory
Es creacional al igual que el singleton porque crea objetos pero en este se crean familas de objetos que están relacionadas mediante la herencia o implementación de interfaces. Nos permite crear diferenes objetos que estan relacionados por parentezco, ya sea mediante la herencia o implementación de una clase más generica. Las fabricas crean los productos y los productos tienen varios tipos. Esta implementación debe ser escalable, que permita crear una nueva familia de productos y una nueva fábrica concreta con nuevos productos que va a implementar.
Hay dos partes:
1. El producto o el objeto que vamos a crear: Los producto son los objetos que se van a crear. Son familias de objetos que en este patrón se conoce como el producto.
2. Las clases fábrica, las que crean la instancia: donde vamos a crear estos productos. Son metodos abstractos que tienen que implementar fabricas concretas, por elemplo FabricaConcreta1, FabricaConcreta2. Ejemplo: factoría windows,. factoria mac, factoria linux


##Patrón Decorator
pertenece a la categoría de los estructurales. Tiene como finalidad agregar funcionalidad dinámica al objeto, pero sin usar la herencia.
Se usan menos clases de herencia al usarlo al intenta agregar muchas caracteristicas al objeto.
Tanto el decorador como lo decorado comparten la misma intefaz, por lo que el decorador, de forma recursiva, va a envolver al objeto y no solamente al objeto en cuestión, sino también a los decoradores que contienen o envuelven al objeto.

### Participantes del decorator:
- Componente: Define la intefaz para los objetos que pueden tener responsabilidades añadidas.
- Componente concreto: Define un objeto al cual se le pueden agregar responsabilidades adicionales.
- Decorador: Mantiene una referencia al componente asociado. Implementa la interfaz de la superclase Componente.
- Decorador concreto: Añade responsabilidades al componente. Imoplementación del decorador.

##Patrón Composite
Permite construir objetos complejos a partir de otros objetos más simples, pero que tengan en común alguna clase abstracta, alguna interfaz, es decir que sean similares o del mismo tipo.
Intenta solucionar el problema de la recursividad.


##Patron observer
Define una dependencia entre objetos de uno a muchos. Cuando el objeto principal que se está observando cambia su estado, notifica el cambio a todos sus objetos dependientes de forma automatica.
Los objetos dependientes son los observadores y estan escuchando y pendientes del cambio de estado del objeto principal. Los observadores es el sujeto o quien esta escuchando, por eso se lo conoce como observable.
Es un patrón de diseño del tipo comportamiento , pero también estructural por las relaciones entre los objetos. Es un patrón de diseño del tipo comportamiento pero también es del tipo estructural por las relaciones entre objetos
 o clases, pero tambien de comportamiento porque define la forma en la que los objetos se comunican.

##Patrón Strategy
Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos,
colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.

###Problema


Un día decidiste crear una aplicación de navegación para viajeros ocasionales.
La aplicación giraba alrededor de un bonito mapa que ayudaba a los usuarios a orientarse rápidamente en cualquier ciudad.

Una de las funciones más solicitadas para la aplicación era la planificación automática de rutas. 
Un usuario debía poder introducir una dirección y ver la ruta más rápida a ese destino mostrado en el mapa.

La primera versión de la aplicación sólo podía generar las rutas sobre carreteras.
Las personas que viajaban en coche estaban locas de alegría. Pero, aparentemente, no a todo el mundo le gusta conducir
durante sus vacaciones. De modo que, en la siguiente actualización, añadiste una opción para crear rutas a pie.
Después, añadiste otra opción para permitir a las personas utilizar el transporte público en sus rutas.

Sin embargo, esto era sólo el principio. Más tarde planeaste añadir la generación de rutas para ciclistas, y más tarde,
otra opción para trazar rutas por todas las atracciones turísticas de una ciudad.
Aunque desde una perspectiva comercial la aplicación era un éxito, la parte técnica provocaba muchos dolores de cabeza.
Cada vez que añadías un nuevo algoritmo de enrutamiento, la clase principal del navegador doblaba su tamaño. 
En cierto momento, la bestia se volvió demasiado difícil de mantener.

Cualquier cambio en alguno de los algoritmos, ya fuera un sencillo arreglo de un error o un ligero ajuste de 
la representación de la calle, afectaba a toda la clase, aumentando las probabilidades de crear un error en un 
código ya funcional.

Además, el trabajo en equipo se volvió ineficiente. Tus compañeros, contratados tras el exitoso lanzamiento,
se quejaban de que dedicaban demasiado tiempo a resolver conflictos de integración. Implementar una nueva función te
exige cambiar la misma clase enorme, entrando en conflicto con el código producido por otras personas.


###Solución:


El patrón Strategy sugiere que tomes esa clase que hace algo específico de muchas formas diferentes y extraigas todos 
esos algoritmos para colocarlos en clases separadas llamadas estrategias.

La clase original, llamada contexto, debe tener un campo para almacenar una referencia a una de las estrategias. 
El contexto delega el trabajo a un objeto de estrategia vinculado en lugar de ejecutarlo por su cuenta.

La clase contexto no es responsable de seleccionar un algoritmo adecuado para la tarea. En lugar de eso, 
el cliente pasa la estrategia deseada a la clase contexto. De hecho, la clase contexto no sabe mucho acerca
de las estrategias. Funciona con todas las estrategias a través de la misma interfaz genérica, que sólo expone un 
único método para disparar el algoritmo encapsulado dentro de la estrategia seleccionada.

De esta forma, el contexto se vuelve independiente de las estrategias concretas, así que puedes añadir nuevos algoritmos
o modificar los existentes sin cambiar el código de la clase contexto o de otras estrategias.
En nuestra aplicación de navegación, cada algoritmo de enrutamiento puede extraerse y ponerse en su propia clase con
un único método crearRuta. El método acepta un origen y un destino y devuelve una colección de puntos de control de la ruta.

Incluso contando con los mismos argumentos, cada clase de enrutamiento puede crear una ruta diferente.
A la clase navegadora principal no le importa qué algoritmo se selecciona ya que su labor principal es representar
un grupo de puntos de control en el mapa. La clase tiene un método para cambiar la estrategia activa de enrutamiento,
de modo que sus clientes, como los botones en la interfaz de usuario, pueden sustituir el comportamiento seleccionado 
de enrutamiento por otro.


```
// La interfaz estrategia declara operaciones comunes a todas
// las versiones soportadas de algún algoritmo. El contexto
// utiliza esta interfaz para invocar el algoritmo definido por
// las estrategias concretas.
interface Strategy is
    method execute(a, b)

// Las estrategias concretas implementan el algoritmo mientras
// siguen la interfaz estrategia base. La interfaz las hace
// intercambiables en el contexto.
class ConcreteStrategyAdd implements Strategy is
    method execute(a, b) is
        return a + b

class ConcreteStrategySubtract implements Strategy is
    method execute(a, b) is
        return a - b

class ConcreteStrategyMultiply implements Strategy is
    method execute(a, b) is
        return a * b

// El contexto define la interfaz de interés para los clientes.
class Context is
    // El contexto mantiene una referencia a uno de los objetos
    // de estrategia. El contexto no conoce la clase concreta de
    // una estrategia. Debe trabajar con todas las estrategias a
    // través de la interfaz estrategia.
    private strategy: Strategy

    // Normalmente, el contexto acepta una estrategia a través
    // del constructor y también proporciona un setter
    // (modificador) para poder cambiar la estrategia durante el
    // tiempo de ejecución.
    method setStrategy(Strategy strategy) is
        this.strategy = strategy

    // El contexto delega parte del trabajo al objeto de
    // estrategia en lugar de implementar varias versiones del
    // algoritmo por su cuenta.
    method executeStrategy(int a, int b) is
        return strategy.execute(a, b)


// El código cliente elige una estrategia concreta y la pasa al
// contexto. El cliente debe conocer las diferencias entre
// estrategias para elegir la mejor opción.
class ExampleApplication is
    method main() is
        Create context object.

        Read first number.
        Read last number.
        Read the desired action from user input.

        if (action == addition) then
            context.setStrategy(new ConcreteStrategyAdd())

        if (action == subtraction) then
            context.setStrategy(new ConcreteStrategySubtract())

        if (action == multiplication) then
            context.setStrategy(new ConcreteStrategyMultiply())

        result = context.executeStrategy(First number, Second number)

        Print result.
        
       
```


###Aplicabilidad:


***Utiliza el patrón Strategy cuando quieras utiliza distintas variantes de un algoritmo dentro de un objeto y
poder cambiar de un algoritmo a otro durante el tiempo de ejecución.***

El patrón Strategy te permite alterar indirectamente el comportamiento del objeto durante el tiempo de ejecución asociándolo con distintos subobjetos que pueden
realizar subtareas específicas de distintas maneras.

***Utiliza el patrón Strategy cuando tengas muchas clases similares que sólo se diferencien en
la forma en que ejecutan cierto comportamiento.***

El patrón Strategy te permite extraer el comportamiento variante para ponerlo en una jerarquía de clases separada 
y combinar las clases originales en una, reduciendo con ello el código duplicado.

***Utiliza el patrón para aislar la lógica de negocio de una clase, de los detalles de implementación de algoritmos que 
pueden no ser tan importantes en el contexto de esa lógica.***

El patrón Strategy te permite aislar el código, los datos internos y las dependencias de varios algoritmos, 
del resto del código. Los diversos clientes obtienen una interfaz simple para ejecutar los algoritmos y 
cambiarlos durante el tiempo de ejecución.

***Utiliza el patrón cuando tu clase tenga un enorme operador condicional que cambie entre distintas
variantes del mismo algoritmo.***

El patrón Strategy te permite suprimir dicho condicional extrayendo todos los algoritmos para ponerlos en clases 
separadas, las cuales implementan la misma interfaz. El objeto original delega la ejecución a uno de esos objetos, 
en lugar de implementar todas las variantes del algoritmo.


###Cómo implementarlo


En la clase contexto, identifica un algoritmo que tienda a sufrir cambios frecuentes.
También puede ser un enorme condicional que seleccione y ejecute una variante del mismo algoritmo 
durante el tiempo de ejecución.

Declara la interfaz estrategia común a todas las variantes del algoritmo.

Uno a uno, extrae todos los algoritmos y ponlos en sus propias clases. 
Todas deben implementar la misma interfaz estrategia.

En la clase contexto, añade un campo para almacenar una referencia a un objeto de estrategia.
Proporciona un modificador set para sustituir valores de ese campo. La clase contexto debe trabajar con el 
objeto de estrategia únicamente a través de la interfaz estrategia. La clase contexto puede definir una 
interfaz que permita a la estrategia acceder a sus datos.

Los clientes de la clase contexto deben asociarla con una estrategia adecuada que coincida con la forma en la que 
esperan que la clase contexto realice su trabajo principal.


###PROS:


- Puedes intercambiar algoritmos usados dentro de un objeto durante el tiempo de ejecución.
- Puedes aislar los detalles de implementación de un algoritmo del código que lo utiliza.
- Puedes sustituir la herencia por composición.
- Principio de abierto/cerrado. Puedes introducir nuevas estrategias sin tener que cambiar el contexto.

###CONTRAS:


- Si sólo tienes un par de algoritmos que raramente cambian, no hay una razón real para complicar el programa en exceso con nuevas clases e interfaces que vengan con el patrón.
- Los clientes deben conocer las diferencias entre estrategias para poder seleccionar la adecuada.
- Muchos lenguajes de programación modernos tienen un soporte de tipo funcional que te permite implementar distintas versiones de un algoritmo dentro de un grupo de funciones anónimas. Entonces puedes utilizar estas funciones exactamente como habrías utilizado los objetos de estrategia, pero sin saturar tu código con clases e interfaces adicionales.


###RELACIONES CON OTROS PATRONES:


1. Bridge, State, Strategy (y, hasta cierto punto, Adapter) tienen estructuras muy similares. De hecho,todos estos patrones se basan en la composición, que consiste en delegar trabajo a otros objetos. Sin embargo, todos ellos solucionan problemas diferentes. Un patrón no es simplemente una receta para estructurar tu código de una forma específica. También puede comunicar a otros desarrolladores el problema que resuelve.

Command y Strategy pueden resultar similares porque puedes usar ambos para parametrizar un objeto con cierta acción. No obstante, tienen propósitos muy diferentes.

2. Puedes utilizar Command para convertir cualquier operación en un objeto. Los parámetros de la operación se convierten en campos de ese objeto. La conversión te permite aplazar la ejecución de la operación, ponerla en cola, almacenar el historial de comandos, enviar comandos a servicios remotos, etc.

3. Por su parte, Strategy normalmente describe distintas formas de hacer lo mismo, permitiéndote intercambiar estos algoritmos dentro de una única clase contexto.

4 .Decorator te permite cambiar la piel de un objeto, mientras que Strategy te permite cambiar sus entrañas.

5. Template Method se basa en la herencia: te permite alterar partes de un algoritmo extendiendo esas partes en subclases. Strategy se basa en la composición: puedes alterar partes del comportamiento del objeto suministrándole distintas estrategias que se correspondan con ese comportamiento. Template Method trabaja al nivel de la clase, por lo que es estático. Strategy trabaja al nivel del objeto, permitiéndote cambiar los comportamientos durante el tiempo de ejecución.

6. State puede considerarse una extensión de Strategy. Ambos patrones se basan en la composición: cambian el comportamiento del contexto delegando parte del trabajo a objetos ayudantes. Strategy hace que estos objetos sean completamente independientes y no se conozcan entre sí. Sin embargo, State no restringe las dependencias entre estados concretos, permitiéndoles alterar el estado del contexto a voluntad.



### Strategy en Java
Strategy es un patrón de diseño de comportamiento que convierte un grupo de comportamientos en objetos y los hace intercambiables dentro del objeto de contexto original.

El objeto original, llamado contexto, contiene una referencia a un objeto de estrategia y le delega la ejecución del comportamiento. Para cambiar la forma en que el contexto realiza su trabajo, otros objetos pueden sustituir el objeto de estrategia actualmente vinculado, por otro.
## ENLACE STRATEGY Y EJEMPLOS:
https://refactoring.guru/es/design-patterns/strategy


https://refactoring.guru/es/design-patterns/strategy/java/example
https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm




## TAREA RESUELTA POR EL PROFE

¿Qué es un patrón de diseño? explique brevemente

Un patrón describe un problema que ocurre infinidad de veces en nuestro entorno, así como la solución al mismo, de tal modo que podemos utilizar esta solución un millón de veces más adelante sin tener que volver a pensarla otra vez.

¿Para que nos sirve un patrón de diseño? explique brevemente.

Son fundamentales para reutilizar los diseños en el desarrollo orientado a objetos y solucionar un problema común y documentado.

Nombre los tres tipos o categorías de patrones de diseño e indique uno o dos patrones en cada uno, explicando brevemente el patrón (máx. 2 líneas).

Creacionales: Resuelven problemas de creación de objetos

Singleton La intención del patrón consiste en garantizar que una clase sólo tenga una única instancia y proporcionar un punto de acceso global a ella. El patrón singleton se implementa creando en nuestra clase un método que crea una instancia del objeto sólo si todavía no existe alguna. Para asegurar que la clase no puede ser instanciada nuevamente se regula el alcance del constructor (con visibilidad como protegido o privado).

Abstract Factory Permite trabajar con objetos de distintas familias de manera que las familias no se mezclen entre sí y haciendo transparente el tipo de familia concreta que se esté usando

Estructurales: Resuelven problemas de composición de clases

Composite La intención del patrón es tratar objetos individuales y objetos compuestos recursivamente en forma uniforme.

Es aplicable cuando los objetos se deben componer en forma recursiva, y no hay distinción (o hay poca) entre objetos compuestos y componentes, y la estructura se puede tratar en forma uniforme.

Decorator (Envoltorio): Añade funcionalidad a una clase dinámicamente.

Comportamiento: Interacción de objetos

Iterator (Iterador): Permite realizar recorridos sobre objetos compuestos independientemente de la implementación de estos.

Observer (Observador): Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambie de estado se notifique y actualicen automáticamente todos los objetos que dependen de él.