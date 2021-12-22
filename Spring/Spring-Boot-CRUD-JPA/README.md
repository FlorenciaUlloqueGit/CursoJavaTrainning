# PROYECTO CON SPRING BOOT Y JPA

### Diferencia entre JPA e  hibernate
JPA es una especificación, propone la dforma en al que se tiene que implementar un ORM  (mapeo objeto relacion = mapeo de base de datos relacionales)estándar en java. JPA es la especificación de persistencia en la plataforma java y de hechom, las siglas jpa significan Api de Persistencia  de Java. La api jpa  propoine  un conjunto de interfaces que especifican como se tiene que implementar la persistencia.

Hibernate es proveedor, es decir, un framework que implementa el standard JPA, pero tambien lo implementan otros más, no es el único. Por defecto spring boot trabaja con hibernate como proveedor de jpa.


### H2 Database
es un motor de base de datos en memoria y viene embebido en nuestro proyecto. Es solo para desarrollar y no para producción, como sql o oracle. Sirve para probar nuestro desarrollo y despues podemos emigrar a un motor de base de datos. Tiene estas características: sirve solamente para desarrollar, es a nivel memnoria, viene dentro del proyecto con un tamaño muy pequeño y cada vez que levantamos la aplicación se crea este dato, se crean las tablas automáticamente y, al bajar el servicio , la base de datos, que se encuentra en memoria, se destruye completamente, por lo que se reinicia cada vez que levantamos o reiniciamos el servidor de nuestra aplicación. Las tablas se crean de forma atomática a través de la clase Entity en JPA o Hibernate. Una clase entity está mapeada a una tabla y este mapping se implementa con anotaciones, las que permitemn crear el esque,a de la tabla porque podemos indicar la metadata en la clase entity con estas anotaciones

#### Ingresar a H2 Database
1) En application.properties poner: spring.h2.console.enabled=true
2) localhost:8080/h2-console

### Etiquetas 

- @Entity: para indicar que la clase cliente esta mapeada a una tabla  y es una entidad de JPA o Hibernate. Arriba de la clase
- @Table: Para config el nombre de la tabla, es opcional porque si no lo argegamos queda como el nombre de la clase. Arriba de la clase.
- 	@Id : para indicar que es la clave primaria
- 		@GeneratedValue(strategy=GenerationType.IDENTITY ) autoincrtemento de 1 a 1

- 	@Column(name = "nombre_cliente") -> para cambiar el nombre de una colmna de la tabla
- 	@Temporal(Date /time, etc) -> Soplo para fechas. indica el formato en el que se va a guardar el campo
- @Repository-> anotación de spring para marcar la clase como de componente a persistencia, de acceso a datos. por debajo implementa @component
- Entity Manager: se encarga de manejar las clases Entity, el ciclo de vida, la persistencia dentro del contexto y actualiza, elimina, consulta
- 	@Transactional(readOnly = true) //especifica que es solo una transacción de lectura
- @PersistenceContext -> inyecta el Entitiy Manager de forma automática


### Validaciones
-@DateTimeFormat(pattern="yyyy-MM-dd"): especificamos el formato de fecha
- @NotEmpty , solo para string, arriba de un atributo de una clase para especificar que el campo no puede estar vacío. (proviene de la dependencia spring-boot-starter-validation)  
- @NotNull //para campos como date, double, int, etc se usa notnull. 
- @Email -> para emails,requiere el formato email
- @Sixe(min= 4, max=12)
- En el controlador en el método post del formulario, agregar @Valid delante del objeto a importar.
- En el controlador en el método post del formulario,  luego del objeto a importar con @Valid, para saber si falló el form y hubo errores agregar BindingResult  result y obtener el resultado mediante un if dentro del método
- typeMismatch.cliente.fecha = "gdgdfg" -> para lanzar error en caso de que el formato de fecha sea invalido 

https://programandoointentandolo.com/2019/03/spring-boot-validacion-spring-mvc-y-thymeleaf.html

#### Serialización:
Es el proceso de convertir un objeto en una sencuencia de bits para almacenarlo o transmitirlo a la memoria, por ejemplo, o a una base de dtos  o aun Json o XML, o cuando trabajamos con sessiones http se requiere realizar y para eso tenemos que implementar esta interfaz.


### Clase DAO
Dao significa Data Acces Object. Es una clase que implementa y provee una interfaz común para acceder y trabajar con los datos, independiente de las tecnologías a usar JDBC, JPA, Hibernate, TopLink, Codo, etc. Esta interface tiene que  tener los métodos necesarios para recuperar y almacenar los datos (contrato de implementación) con las operaciones básicas: listar, obtener por id, guardar, eliminar, etc. En este curso la implementamos con Entity de JPA

### Documentacion para manejar Crud 
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#preface 
hay plantillas hechas de métodos y palabras claves o podemos usar @query personalizado para elaborar nuestras propias consultas

