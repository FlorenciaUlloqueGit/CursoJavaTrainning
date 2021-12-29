# Event Management UseCase (Caso de uso de gestión de eventos)

Event Management API: 
Es un microservicio usado por Spring Data Rest y que lo expone como un servicio web restful que puede ser consumido por la aplicación web de administración de eventos o aplicaciones móviles, de modo que el usuario final puede crear y administrar eventos.
Los eventos comienzan con un evento que sera creado por el organizador del evento, entonces el organizador es un recurso y cuando el organizador crea un evento el nos provee el lugar de la información del evento, donde exactamente el evento esta sucediendo y otros detalles, 
como el comienzo y el final del evento, etc. Una vez que el evento esta en el lugar, el siguiente recurso se se relaciona con los participantes que estan interesados en participar en ese evento. El organizador puede en cualquier momento comenzar el evento, leer los detalles del evento, modificarlos o eliminarlos.


###Tips:
- @MappedSuperclass -> arriba de la clase abstracta madre. No es un @entity sino que es la clase madre.
- @Column(nullable=false,updatable = false) -> marca la posibilidad de que sea null una columna y modificable. (ej para id)
- @CreationTimestamp -> asigna una creacion de timestamp en la base de datos
- @ManyToOne -> muchos a uno. n-1  . lo pongo en la clase factura por ej y en persona no. una persoba puede tener varias facturas.
Es una de las anotaciones mas habituales a nivel de JPA y se encarga de generar una relación de muchos a uno .
- @JoinColumn:Esta anotación sirve en JPA para hacer referencia a la columna que es clave externa en la tabla y que se encarga de definir la relación . En nuestro caso la tabla Factura contendrá una columna persona_nombre con el nombre de la persona propietaria de la factura.
	@JoinColumn(nullable = false)-> no permite que sea null la columna. no es la columna directa sino la union con la columna

####Antes de crear los repositorios si uso timeZone o instant o Zone.id:
. Bajar Hibernate version
- agregar Jackson JSR310 dependecy : especificacióm de oracle que ofrece el id de la zona y la fecha y la hora y todo lo rel. con java.
- usar el convertor


1) entro al pom y agrego en properties abajo de la version de java: 	<hibernate.version>5.2.10.Final</hibernate.version> para actualizar la version de hibernate a una mas nueva
2)https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.8.7 copio la dependencia y la pego en el pom.
3) @EntityScan en el main application

####Fetch vs lazy

-El tipo de captura Lazy se selecciona de forma predeterminada por Hibernate a menos que marque explícitamente el tipo de captura Eager. Para ser más precisos y concisos, la diferencia se puede establecer de la siguiente manera.

FetchType.LAZY = Esto no carga las relaciones a menos que lo invoque a través del método getter.

FetchType.EAGER = Esto carga todas las relaciones.

Pros y contras de estos dos tipos de búsqueda.

Lazy initialization mejora el rendimiento al evitar cálculos innecesarios y reducir los requisitos de memoria.

Eager initialization consume más memoria y la velocidad de procesamiento es lenta.

Dicho esto, depende de la situación se puede usar cualquiera de estas inicializaciones.

#### Cascade= cascadeType....
 El atributo Cascade nos permitirá la propagación en cascada de las operaciones realizadas en la entidad principal.
Cascade, en JPA o Hibernate, permite simplificar las operaciones en nuestro código Java. Cuando realizamos alguna acción en la entidad objetivo, la misma acción se aplicará automáticamente a sus entidades asociadas.

Las relaciones entre entidades a menudo dependen de la existencia de otra entidad. Esto resulta directamente del mapeo realizado a la base de datos relacional en la que el ORM esté actuando. or ejemplo, en una relación Usuario-Dirección, si eliminamos el Usuario, la entidad Dirección no tiene ningún sentido. Cuando eliminamos la entidad Usuario, nuestra entidad Dirección también debería eliminarse
Las operaciones en cascada de JPA / Hibernate, representadas en el enum javax.persistence.CascadeType, son:
- CascadeType.ALL: se aplican todos los tipos de cascada.
- CascadeType.PERSIST: las operaciones de guardado en la base de datos de las entidades padre se propagarán a las entidades relacionadas.
- CascadeType.MERGE: las entidades relacionadas se unirán al contexto de persistencia cuando la entidad propietaria se una.
- CascadeType.REMOVE: las entidades relacionadas se eliminan de la base de datos cuando la entidad propietaria se elimine.
- CascadeType.REFRESH: las entidades relacionadas actualizan sus datos desde la base de datos cuando la entidad propietaria se actualiza.
- CascadeType.DETACH: se separan del contexto de persistencia todas las entidades relacionadas cuando ocurre una operación de separación manual.

Por defecto, no se aplica ninguna operación de cascada.

***Diferencia entre persist y merge:***
***entityManager.persist(objeto)***
1) Inserta el objeto Java como un nuevo registro en la base de datos.
2) Añade el objeto Java al Entity Manager y pasa a ser administrado por la misma.
**entityManager.merge(objeto)***
- Busca un objeto Java ya administrado por el Entity Manager con la misma identificación.
- Si existe, actualiza en la base de datos y devuelve el objeto ya administrado.
- Si no existe, inserta el nuevo registro en la base de datos y pasa a ser administrado.

Aunque merge realiza la misma función que persist, la operación persist es más eficiente para insertar un nuevo registro en una base de datos que merge. Por otra parte, con persist no se duplica el objeto original y, lo más importante, con persist te aseguras de que está insertando y no actualizando por error.

El resumen rápido y sencillo es:

persist –> para insertar un nuevo objeto en la base de datos
merge –> para actualizar un objeto existente en la base de datos


CascadeType.ALL
Por norma general el atributo ALL se debe intentar evitar a toda costa. La replicación de todas las operaciones en cascada puede jugar en nuestra contra si no sabemos el efecto de las mismas en nuestro modelo.

¿Cuándo utilizar CascadeType.ALL?
En aquellos caso en que aplique el uso de todas las operaciones en cascada. Simplemente nos da legibilidad al código y permite ahorrarnos anotar todos los atributos. No se debe utilizar como comodín ni ponerse en casos de desconocimiento de la funcionalidad de la relación.

CascadeType.PERSIST
El atributo PERSIST propaga la operación de persistencia de una nueva relación principal a sus nuevas relaciones secundarias. Cuando guardamos la entidad Usuario, la entidad de Direccion también se guardará.
CascadeType.REFRESH
El atributo REFRESH y el atributo DETACH no suelen ser habituales. Por tanto nos debemos centrar en el resto de atributos de Cascade.

¿Cuándo utilizar CascadeType.REFRESH?
En el caso del atributo REFRESH, si realizamos una operación EntityManager.refresh(objeto) los objetos se vuelven a cargar desde la base de datos. El contenido del objeto gestionado en la memoria se descarta (incluidos los cambios, si los hubiera) y se reemplaza por los datos que se recuperan de la base de datos. Esto podría ser útil para garantizar que la aplicación maneje la versión más actualizada de un objeto de entidad, en caso de que otro EntityManager lo haya cambiado desde que se recuperó. No es algo común en aplicaciones sencillas.

CascadeType.DETACH
¿Cuándo utilizar CascadeType.DETACH?
El uso del atributo DETACH tampoco suele ser de uso común. En el caso de sacar un objeto del contexto de persistencia, de forma manual, entonces sí que deberíamos realizar la operación en cascada para las entidades relacionadas con el mismo. La operación EntityManager.detach(objeto) sólo la saca al objeto del contexto de persistencia, con lo que se cancelan los cambios al no persistirse en base de datos.

Qué hace orphanRemoval?
orphanRemoval es un atributo específico del ORM que marca la entidad secundaria a eliminar cuando ya no se haga referencia a ella desde la entidad principal. Por defecto se encuentra desactivado, es decir, a false. Tiene especial interés en casos de tratamiento de colecciones, facilitando el borrado de elementos no asociados.


https://www.nestoralmeida.com/cascade-en-jpa-hibernate/#0-introducci%C3%B3n

¿Cuándo utilizar CascadeType.PERSIST?
Es util en los casos en los que sabemos que al insertar la entidad principal sus secundarias también han de ser insertadas porque se han creado en el mismo momento. Por ejemplo, si al crear un Usuario también hemos creado su Direccion.

CascadeType.MERGE
El atributo MERGE propaga la operación de actualización en la base de datos de una relación principal a sus secundarias. Cuando guardamos la entidad Usuario, la entidad de Direccion también se guardará.

¿Cuándo utilizar CascadeType.MERGE?
Es util en los casos en los que sabemos que al modificar la entidad principal sus secundarias también han de ser modificadas porque se han creado en el mismo momento. Por ejemplo, si al modificar un Usuario también hemos modificado su Direccion.

CascadeType.REMOVE
El atributo REMOVE permite eliminar automáticamente todas las relaciones asociadas a la relación principal cuando esta se elimina.

¿Cuándo utilizar CascadeType.REMOVE?
A priori, la utilización del borrado en cascada, puede parecer habitual. Dependiendo de la complejidad de la relación se podría eliminar la necesidad de ir eliminando las instancias de otras entidades asociadas de forma programática. Sin embargo, aunque es un elemento muy interesante y facilitador, debe utilizarse con mucho cuidado.

Hay sólo dos situaciones en las que un borrado en cascada se puede usar sin problemas: relaciones one-to-one y one-to-many, en donde hay una clara relación de propiedad y la eliminación de la instancia principal debe causar la eliminación automática de sus instancias dependientes.

No se debe utilizar el borrado en cascada con relaciones múltiples many-to-many. Una colección anotada con @ManyToMany asocia dos entidades principales a través de una tabla de combinación, ¡no debemos ni queremos propagar la eliminación de un elemento principal a otro!