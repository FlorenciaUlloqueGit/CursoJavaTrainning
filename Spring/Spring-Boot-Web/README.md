#Spring y Spring boot


##  Spring Boot
Spring boot viene con un conjunto poderoso de configuraciones automáticasque por defecto notenemos que tocar nada, ejempplo no hay que oconfigurar nuestras vistas, ni jdbc etc
se puede personalizar la configuración que viene por defecto si queremos hacer un cambio en esta. Tampoc hay qeu configurar el package principal ni el package base mediante el component scan, ya quwe ya viene todo configurado y listo.
Algunas cosas se configuran de forma automática o tienen una configuracipón mínima.
Otra ventaja de Springboot es que trae su propio servidor embebido, dentro, un TomCat, por lo que no es necesario tener que configurar , descagargar e instalar un Tomcat externo o un glassfish. no se requiere un servidor externo ya que viene incluido y es mucho mas independiente y desacoplado, más portable.

Puntos importantes: 
- Configuraciones automáticas
- Servidor embebido.
- Tomcat.
- Manejo de dependencias de forma automática.


##Spring
Características de Spring:
- Inyección de dependencia: Nos permite inyectar o pasar una isntancia de un componente que está registrado en el contenedor de Spring a otro componente registrado en spring.
- Modelo Vista Controlador (MVC):  En vez de crear la instancia con el new simplemente se maneja en contexto y lo podemos proveer e inyectar mediante este patron modelo vista controlador (MVC (controlador: maneja los datos y las peticiones de usuario e interactua con el modelo y con las vistas)) 
- Modelo Programación reactiva(WebFlux) : Programación asíncrona en java que no bloquea los procesos ni las peticiones http y el flujo de comunicación, de procesos de código al correr en diferentes hilos.
- Acceso a Datos y Persistencia (JPA): es par trabajar con DB  pero nos permite mapear clases POJO que se las conoce como entity a tabla de la DB y permite trabajar en vez de consultas SQL trabajamos 100% con objetos y estos objetos están mapeados a tabla.
- Programación orientada a aspectos (AOP): Permite de forma transversal agregar mayor funcionalidades a nuestras clases. Es un interceptor que intercepta métodos par ahacer algo antes o después o durante la invocación de ese método. 
- Cero configuración: La configuración se reduce a  0 porque viene todo configurado y listo para empezar a desarrollar, escribir controladores vistas y crear aplicación. de todas formas esto se puede extender y personalizar en un archivo properties.
- Mínimo requerido JDK 8: en adelante
- Programación funcional con Reactor: relacionado a la ´programación reactiva, es decir en cascadas, flujos o streams y a traves de estos streams trabajamos en el caso de Reactor con streams reactivos que también se los conoce como observables o fluxs. cumple con el patrón de diseño observador.


### Componentes que se vana  ver en esta sección:
- Spring boot: el core, la base, incluye spring framerwork y dentro de este esta Spring IoC 
- Spring IoC :es el patrón de impresión de control, que nos permite todo el manejo de beans o componentes, manejo de contextos, etc. Estos componentes son objetos que los podemos guardar en el contenedor, se pueden registrar de diferentes formas usando anotaciones y se pueden inyectar estos componentes registrados en otros componentes que tambipen estan registrados. Ej: a un controlador se le puede inyectar un service, una instancia de service para lógicad e negocios, manejo de repositorios o datos, etc
- Spring MVC: lo vemos con los controladores usando anotaciones. Mapear estos métodos handler o de manejo de peticios http del controlador los mapeamos a una ruta url, a un endpoint y vistas thymeleaf. 
- Vistas Thymeleaf: Motor de templates que se encarga de analizar, de parsear esta plantilla y convierte todo estos atributos o código propios de Thymeleaf a HTML. Ideal para trabajar con HTML 5 ya que es potente y facil de programar y separa completamente el código Java del HTML. En estas vistas no existe el código Java sino que solo trabajamos con atributos y directivas principalmente. También podemos implementar API rest y maneja una API completa y muy robusta para implementar esas APIS que pueden retornar por defecto Json, XML y otro tipo de respuesta.

###Creacion del proyecto 
Usamos Jar cuando vamos a usar thymeleaf y APi rest y war cuando queremos publicar en un servidor externo que no sea el que  viene incluido en Spring boorm por ej, TomCat externo, glassfish y tambien si queremios usar vistas jsp porque con JAR no se puede.

Dependencias a agregar: Spring boot DevTools / thymeleaf /Spring web

## Partes del proyecto
- Pom : tiene las dependencias necesarias para trabajar en un proyecto: ej thymeleaf, hiernate, jpa.
- Maven dependences : dependencias de maven que se descargan en el proyecto. librerias de todo.
- src/main/resources: contiene la configuración application.properties, al configuración principal de SpringBoot. Acá se puede sobreescribir la configuración que viene por defecto. viene vacío porque toda la configuración viene ya por debajo y por defecto. Ej: si quiero cambiar el puerto 8080 por otro puerto
- Static y template: en sttatic van losrecursos estaticos de la aplicacion  y en template se guardan las plantillas y las vistas de los controladores ej: hojas de estilo, imágenes de thymeleaf.
- dentro de la  carpeta scr/main/java: va todo el codigo fuente de las clases, el package. tiene la clase principal SpringBoot que es donde arranca la aplicación con el método main. eta clase va a ejecutar la clase estatica springApplication y le pasamos el nombre de la clase principal
-Target: Cuando generemos y publiquemos el archivo JAR a traves de Maven Package, despues lo vamos a ver en esta carpeta. lo podemos levantar a traves del comando java-jar


##crear el controlador :
dentro del package controler en el main java


## Spring MVC (Modelo vista controlador):   

Es un framework web, un componente parte de Spring framework, está basado en la arquitectura modelo vista controlador , se integra con el contexto de inyeccion de dependencias porque conecta el on¿bejto a traves de su interfaz y no a traves de su tipo concreto. La interfaz es mas generica entonces es mas facil cambiarla en la posterioridad y toma ventaja de los siguientes principios:
1) Modelo, vista y controlador: separa nuestr a aplicación en tres grandes componentes: los modelos, las vistas y los controladores y el controlador recibe peticiones HTTP request por parte del usuario y responde peticiones con HTTP Response
2) Inyección de dependencia.
3) Orientado al uso de interfaces.
4) Uso de clases POJO

###Funcionamiento de Spring
El front Controller DispatcherServlet recibe una solicitud HTTP del navegador. El front controller es un patrón de diseño que está dentro de Spring mvc y se encarga de recibir estas solicitudes HTTP del cliente o del usuario, de obtener la ruta URL y de buscar el controlador que corresponde a esa ruta y le asigna el request a ese controlador para que obtenga los datos de los parametros que se están enviando.

El controlador se relaciona con la lógica del negocio, clase services o de acceso a datos. Obtiene datos a traves de una consulta y se los envia a la vista para que muestre estos datos del modelo en la vista. ej: usando model, model and view, model mapp, etc.

El controlador retorna/asigna el nombre de la vista lógica a amostrar

Se seleccinona un viewResolver, el cual aplica un determinado tipo de vsita(HTML, PDF, EXCEL, etc)

Finalmente la vista es mostrada al cliente usando los datos del objeto model.

#### clara separación de funciones
Los controladores (se encargan de ciertas tareas), validadores se encargan de validar el formulario y los datos que recibe el controlador), objeto form (mapeado tambien a la logica del negocio), dispatcherServket(es el encargado de seleccionar el controlador y su método handler segun la ruta url) , handler mapping(es la ruta de mapeo que tienen cada método de acción del controlador, lo podemos configurar o mapear con la anotación Request Mapping o get mapping o post mapping), view resolver (se encarga de resolver la vista a cargar, ya sea por el nombre y tambien el tipo de vista), etc , llevan a cabo una tarea específica y pueden ser reemplazables sin afectar a los demás.

#### Qué hace un controlador?
Se encarga de manejar las solicitudes de los usuarios, pero además proporcionan acceso a la lógica de negocio. Delega la lógica de negocio a un conjunto de clases de servicio. Los servicios, las clases services, tienen acceso a la base de datos mediante los datos o repository. Mediante de la interfaz los controladores reciben datos por parte de los usuarios, los input a traves de formulario o parámetros de la ruta url y los convierten en un objeto del modelo, poblando en sus atributos estos datos enviados y despues los datos se pueden actualizar o persistir en nuestra DB.

#### Pojo
clase simple que contiene atributos para sus datos. Puede usar interfaces propias de jav pero no de hiberntate o algun framework porque la ideaes que se encuentre totalmente desacoplada de cualquier framework.

### Tips:
- Model: es una interfaz que contiene algunos métodos abstractos y se pasa por argumento una implementaciónde este interfaz para pasar datos a la vista.
- ModelMap: es un object. Implementa variedad de LinkedHasMap (es un mapa de Java ya que lo está heredando).
- ModelAndview: por debajo contiene el modelo map por lo tanto trabaja con un mapa de java para pasar los datos a la lista, pero además permite asignar el nombre de la vista a  través de un metodo setViewName.
- @RequestParam() tipoDato nombre -> sirve para obtener un parámetro 
- @ indica ruta -> reemplaza al signo peso en las rutas y enlaces en Thymeleaf pero solo en metodos propios del proyecto y en metodos handler y tambien recursos, por ejemplo css. @{/paramos/string}. 
- parametros: se indican en con los parentesis, se abre y se cierra el paréntesis entre el nombre del parámetro.
- PathVariable: en un parametro en la ruta de Spring que estamos mapeando y que, justamente como dice, es variable. es mas variable y limpia para escribir url y enviar parametros. Es similar a RequestParam().
- Carpeta static: en esta carpeta se guardan todos los archivos estático, ej: imagenes, hojas de estilo, html estatico, etc
- @value(nombreTextoGuardadoEnApplication.Property) -> inyecta el texto guardado en application.propery (inyección de dependencia aplicado a String texto)
- ApplicationProperties se usa para configuraciones de DB, de puertos, etc, por lo que es mejor hacer un archivo nuevo para configurar textos y otros datos.
- La diferencia entre redirect y cargar una nueva vista es que cuando se redirecciona se carga una petición desde 0 y todos los parámetros que teníamos en el request se borran, mientra que cargar una vista es pasar parámetros y cargar, redenrizar el HTML. Cuando se redirige se reinicia y parte el controlador y el proceso desde cero. 

- Forward: El forward es solo para rutas propias del proyecto, no para páginas externas.  redirección con forward. no recarga ni reinicia la página , es mejor opción para una página de inicio.  ejecuta por abajo un requestDispatcher.
Redirect: La redirección con redirect reinicia el proceso desde 0. Brinda la posibilidad de redirigir a vistas dentro del proyecto como a páginas o enlaces externos a este.

-mvnw: Este archivo contiene una aplicación, un script que descarga maven y envuelve las funcionalidades típicas para generar un proyecto con maven install o maven package.
 	pasos: 
 	1) Ir a terminal y ejecutar: cd (llegar hasta el proyecto)
 	2) ejecutar .\mvnw.cmd package (debe aparecer build succes)
 	3) ejecutar:  java -jar
 	z



