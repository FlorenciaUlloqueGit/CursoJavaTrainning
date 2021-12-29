
 ## aplicaciones monoliticas
Tienen muchos modulos y un solo codigo grande, lo que hace dificil buscar y arreglar un error. Para encotnrarlo hay que buscarlo en la aplicación entera
agregar nuevas configuraciones también es dificil ya que todos los modulos deben ser impactados correctamente cuando se hace un cambio y no solo a uno de esos módulos. Por este hecho usamos los microservicios:
Los microservicios son pequeños y focalizados servicios que reunen juntas todas las piezas que cambian  por la misma razón. 
Podemos tener por cada módulo un pequeño microservicio que tiene definidos los límites de su código por los limites comerciales del negocio. Estos microservicios pueden evitarse y crecer independientemente . 
Los microservicios son autónomos, son pequeños y focalizados  or servers. Los microservicios se empaquetan en su propia máquina o servidor, podemos empaquetar cada uno de estos microservicios e implementarlos dentro de su propia maquina.
La evaliacion de la nube y de todas las maquinas virtuales y el uso de estas debe ser realizado de forma cuidadosa. Una vez implementados los microservicios toda la comunicacion ocurre mediante los servicios a traves de llamadas a la red.
Cada microservicio usa una api que se comunica con la api del otro microservicio y consume los servicios proveidos por esta.
La regla de oro para saber si la aplicacion que estoy construyendo es un microservicio es que puedo cambiar e implementar la aplicación sin cambiar o impactar en otro servicio 

### Características y ventajas de los microservicios:
- Heterogeneos: Cada microservicio puede ser escrito en un lenguaje de programación diferente y pueden ser escritos en diferentes plataformas o sistemas operatiivos y ellos se pueden comunicar usando las API's que usualmente son del tipo rest
- Robustez: Si un microservicio falla no afecta el funcionamiento de los otros. Puedo darle de baja a un microservicio y los otros van a seguir funcionando igual.
- Escalable: Las aplicaciones pueden seguir creciendo y son escalables.
- Fáciles de implementar: en las aplicaciones monolíticas para arreglar y encontrar incluso pequeños errores tenemos que implementar la aplicación entera, pero en los microservicios podemos implementar un servicio particular cuando tenemos un error que arreglar.
- Reusabilidad y reemplazabilidad: Los microservicios se utilizan y se comunican unos a otros y usan mecanismos similares, lo de remplables se refiere al hecho de que si quiero reemplazar un microservicio  o un modulo de este puedo hacerlo con facilidad.

## SOA y microservicios: 
SOA: microservicios orientados a la arquitectura. Los servicios orientados ala arquitectura o SOA son un enfoque de diseño donde multiples servicios colaboran para proveer algunas funcionalidades de negocio de principio a fin (de extremo a extremo.
SOA emerge con una meta similar en mente como los microservicios que es superar o abordar los desafios de una aplicacion monolítica, sin embargo SOA tuvo muchas desventajas  y no pudo lograr lo esperado al no poder entender a los proveedores y la iundustra y no pudo resolver los problemas y diferencias que los proveedores tenian. Por eso se empezaron a serparar las partes de una aplicacion en pequeñas aplicaciones como hacen los microservicios.

La diferencia entre los microservicios y SOA es que estos son una mejor version de SOA.

## REST
representational state transfer es una de las principales ramas de pautas de arquitectura y HTTP permite implementar facilmente rest.
operaciones: CREATE, READ, UPDATE, DELETE. 

#### Principios restful
- interface uniforme: HTTP provee una interfaz uniforme para llevar a cabo las operaciones del  CRUD.
- Interface de facil acceso:  Usando estos métodos HTTP, empezando por un post para crear un recurso, un get para obtener un recurso o leer un recurso, un put para modificar un recurso y un delete para eliminar un recurso. Estos métodos (POST, PUT, GET, DELETE, PATCH (Modificar parcialmente)), son conocidos como verbos HTTP.
Estos verbos proveen un acceso fácil y un único método para identificar recursos a traves de una URL. Las uris son conocuidas como nombres porque identifican  un recurso como una forma única. La combinación de verbos y de nombrs puede ser usada para llevar a cabo operaciones crud , por ejemplo crear un empleado.
- Formatos múltiples: HTTP nos permite esto con facilidad ya que soporta XML, JSON o otros formatos y los clientes pueden elegir que formato quieren usar.

##¿Qué significa REST?
REST es una interfaz para conectar varios sistemas basados en el protocolo HTTP (uno de los protocolos más antiguos) y nos sirve para obtener y generar datos y operaciones, devolviendo esos datos en formatos muy específicos, como XML y JSON.

El formato más usado en la actualidad es el formato JSON, ya que es más ligero y legible en comparación al formato XML. Elegir uno será cuestión de la lógica y necesidades de cada proyecto.

REST se apoya en HTTP, los verbos que utiliza son exactamente los mismos, con ellos se puede hacer GET, POST, PUT y DELETE. De aquí surge una alternativa a SOAP.

Cuando hablamos de SOAP hablamos de una arquitectura divididas por niveles que se utilizaba para hacer un servicio, es más complejo de montar como de gestionar y solo trabajaba con XML.

Ahora bien, REST llega a solucionar esa complejidad que añadía SOAP, haciendo mucho más fácil el desarrollo de una API REST, en este caso de un servicio en el cual nosotros vamos a almacenar nuestra lógica de negocio y vamos servir los datos con una serie de recursos URL y una serie de datos que nosotros los limitaremos, es decir, será nuestro BACKEND nuestra lógica pura de negocios que nosotros vamos a utilizar.


¿Por qué debemos utilizar REST?
REST no es solo una moda, y es por las siguientes razones que esta interfaz está teniendo tanto protagonismo en los últimos años:

Crea una petición HTTP que contiene toda la información necesaria, es decir, un REQUEST a un servidor tiene toda la información necesaria y solo espera una RESPONSE, ósea una respuesta en concreto.
Se apoya sobre un protocolo que es el que se utiliza para las páginas web, que es HTTP, es un protocolo que existe hace muchos años y que ya está consolidado, no se tiene que inventar ni realizar cosas nuevas.
Se apoya en los métodos básicos de HTTP, como son:
Post: Para crear recursos nuevos.
Get: Para obtener un lichado o un recurso en concreto.
Put: Para modificar.
Patch: Para modificar un recurso que no es un recurso de un dato, por ejemplo.
Delete: Para borrar un recurso, un dato por ejemplo de nuestra base de datos.
Todos los objetos se manipulan mediante URI, por ejemplo, si tenemos un recurso usuario y queremos acceder a un usuario en concreto nuestra URI seria /user/identificadordelobjeto, con eso ya tendríamos un servicio USER preparado para obtener la información de un usuario, dado un ID.
Ventajas de REST
 Nos permite separar el cliente del servidor. Esto quiere decir que nuestro servidor se puede desarrollar en Node y Express, y nuestra API REST con Vue por ejemplo, no tiene por qué estar todos dentro de un mismo.
 En la actualidad tiene una gran comunidad como proyecto en Github.
 Podemos crear un diseño de un microservicio orientado a un dominio (DDD)
 Es totalmente independiente de la plataforma, así que podemos hacer uso de REST tanto en Windows, Linux, Mac o el sistema operativo que nosotros queramos.
 Podemos hacer nuestra API pública, permitiendo darnos visibilidad si la hacemos pública.
 Nos da escalabilidad, porque tenemos la separación de conceptos de CLIENTE y SERVIDOR, por tanto, podemos dedicarnos exclusivamente a la parte del servidor.


## HATEOAS y HAL:
Hateos: Hipermedia como motor del estado de la aplicación es un componente de la aplicación REST que lo distingue de otras arquitecturas. Es un principio final en la especificación restful por una restricción de la arquitectura de las aplicaciones restful. PAra que una aplicacion sea 100% compatible con rest debe soportar HATEOAS. HATEOAS provee el camino para navegar a traves de todos los recursos restful en la aplicación usando links de hipermedia.

HAL: Lenguaje de aplicacióon de hipertexto. Es una implementación de Hateos e indica la forma de navegar a través de las aplicaciones restful usando las respuestas. Hal provee la estructura exacta de cómo y qué elementos pueden ser links. Es la implementación de HATEOAS.

####Ventajas de usar Rest para implementar microservicios-
- Heterogeneidad: LA comunicación entre diferentes microservicios creados con diferentes lenguajes es simple usando Rest porque lo unico que se necesita es que toda la aplicación soporte HTTP y un particular formato de datos como JSON o XML y la mayoria de las plataformas lo soportan, por lo cual soportan tambien Rest. Las aplicaciones rest son muy robustas porque si alguna esta mal en un microservicio particular la api rest puede degradar esa app en particular en vez de darle de baja a la app entera. 
- Paso facil del proveedor al cliente: nos permite pasar facilmenta el estado de la aplicacion del proveedor rest o del proveedor de la app  a la aplicacion del cliente.
- Facil de implementar: son faciles de implementar. podemos implementarla en algun servidor por defecto .
- Reusabilidad y remplazabilidad: es facil cuando usamos rest remplacar una parte de la app, lo unico que tenemos que hacer es cambiar la api siempre que el contrato y los datos o las solucitudes y respuestas sean los mismos o sino necesitamos un soporte para APIS restful de esta nueva app o un nuevo proveedor


## Spring data Rest

Spring simplifica la creacion de apis restful quitando codificación. Spring data apareció primero con la intención de simplificar el acceso a la capa de datos. Para acceder a la capa de datos con spring data simplementa hay que crear un JPA entity que es como un bean (componente de software que tiene la particularidad de ser reutilizable y asi evitar la tarea tediosa de programar los distintos componentes ono a uno) y despues 
implementa una interface o extiende una interface llamada CRUD repository de spring.  Si hago estos dos pasos automaticamente obtengo todas las operaciones crud (savem findOn, findAll, delete, count, etc). No necesitamos escribir la implementación de estos en nuestra capa de acceso de datos.

Spring data rest, toma estos datos de spring data al siguiente nivel exponiendo todas estas operaciones como recursos restful, entonces sin escribir una simple linea de código nosotros creamos una JPA entity, que es un java bean marjed con anotaciones JPA y crea una interface que extiende de crud repository que expone la base de datos como un recurso restful. se soporta HAL y HATEOAS bien, ya que no tenemos que escribir ninguna lógica personalizada el soporte HAL o auto documentación ya que es una muy potente configuración.


###Pasos para usar spring rest
1) Crear un proyecto con spring boot
2) Crear el domain model/Entity
3) Crear el repositorio
4) Configurar el dataSource (fuente de datos)
5) levantar y correr la app


#### métodos :
-  Student student = findOne(studentId) ( == findById(ID primaryKey)); 
tambien puede retornar un objeto opcional 
Optional <T> findById(ID primaryKey);
Optional <Student> studentOptional = findById(studentId);


####Etiquetas: 

// para entitys:
@Id
@GeneratedValue(strategy=Generation.Type.AUTO)
private Long id;


@Id
@GeneratedValue(strategy=Generation.Type.IDENTITY)  //Maneja el error de nulo  a dif de auto
private Long id;



#### application properties
Agrega algunas propiedades al archivo con la información de la base de datos y algunas personalizaciones


###Listado de servicios 
cuando corro la aplicación a través del archivo java y pongo localhost:8080 me aparecen una lista de servicios de mi aplicacion y un servicio adicional que no se muestra llamado profile. Estos se crean gracias al repositorio que llama a CRUDRepositories.
profile provee meta informacion que puede ser usada por clientes restful para construir formas dinámicamente

#### PATH vs PUT
PUT reemplaza un objeto porcompleto por otro, al modificar un dato del objeto se modifica todo el objeto, poruqe se reemplaza un objeto por otro, PATH, por otro lado, reemplaza parcialmente al objeto, modifica atributos puntuales y no reemplaza al objeto completo.
Con pat si quiero modificar una aprte del objeto solo detallo esa parte y el resto de los tatributos van a seguir teniendo los mismos valores, pero con PUT, si yo no especifico el valor de todos los atributos van a quedar los no especificados en null.

### Apendice de application-properties
https://docs.spring.io/spring-boot/docs/1.1.6.RELEASE/reference/html/common-application-properties.html
