
#Inyección de dependencia:
Es suministrar un objeto una referencia de otro u otros objetos que necesite segun la relación. Resuelve el problema de reutilización y modularidad entre componentes. Ej: el objeto B es inyectado en A. PAra poder hacer inyección de dependenca ambos objetos tienen que estar manejados por el contenedor y registrados, por ejemplo con @Component o con @Service
##Funcionamiento:
el contenedor se encarga de gestionar las instancias y dependencias de componentes mediante la relación e inyección de objetos. Maneja también la creación de objetos cuando se registra, por lo que es importante tener siempre un constructor sin parámetros, ya que por defecto el contenedor va a crear estas instancias con el operador new, pero por debajo y no lo podemos ver.La inyeccipon de dependencia se opone, va en contra oposición de la creación de los objetos de forma explícita (se debe intentar evitar usar el operador new aunque no siempre es posible). Esto permite un bajo acoplamiento entre los  componentes, entre los objetos y se plasma mediante la anotación @Autowired

#### @Autowired
Especifica que se inyectará un objeto dentro de Spring(bean o componente) en un atributo de otro objeto. Es decir,para inyectar  un bean de Spring en el componente actual.Por defecto, la inyección falla si no encuentra candidatos disponibles (ej: si no hay objetos marcados con component).

Lugares donde se puede usar @Autowired: 
- Atributos: 

```
@Component 
publi class usuarioComponent{

@Autowired
private IUsuarioService servicio;

}
```
- Métodos Setter: 

```
@Component 
publi class usuarioComponent{


private IUsuarioService servicio;
@Autowired
Public void setUsuarioService(IUsuarioService servicio){
this.servicio = servicio;
}

}
```
- Constructores:

```
@Component 
publi class usuarioComponent{


private IUsuarioService servicio;
@Autowired
public usuarioComponent(IUsuarioService servicio){
this.servicio = servicio;
}

}
```

#### @Component
Es un estereotipo genérico para cualquier componente manejado por Spring. Tiene tres especializaciones para un uso más específico:
- @Repository: Para persistencia, componentes que acceden a los datos (DAOs) (ej: consultas, operaciones , insert, update, delete, etc)
- @Service: Para servicios  de lógica de negocio. (trabajarcon varios dao, manejo de transaccion de los metodos o cualquier tipo de servicio, request, archivo plano ,petición a api rest, etc, es independiente del origen o dataSource)
- @Controller: Para controladores MVC. 


#### Componentes o beans: 
El término beans se usa para referirse a cualquier componente manejado con Spring. Deben ser anotados con la anotación @Component o sus derivados. Deben tener también un constructor vacío por defecto, sin argumentos. Cualquier beans anotado como @Component o derivados bajo el package base serán instanciados y manejados por el contenedor Di de spring (Auto-scanning), por eso es siempre importante que esten en el paquete base o en un subpaquete de este.

Una anotación con @Configuration signfica que la clase puede ser utilizada por el contenedor Spring como una fuente de definiciones beans.

```
@Configuration
public class AppConfig{

	@Bean
	public IUsuarioService registrarUsuarioService(){
	
	return new UsuarioServiceImpl();
	}

}

```
El ejemplo anterior es igual a hacer esto:

```
@Component
public class UsuarioService implements IUsuarioService{

}

```

#### @primary
hace que se ejecute primer la clase con la etiqueta @primary que el resto cuando dos o mas clases implementan una misma interfaz.
#### @qualifier("nombreClase")
hace que se ejecute la clase que se desea ejecutar. Va debajo del autowired



#### 
Método Handler: 
El método handler toma un evento y un objeto contextual como entrada y devuelve una cadena. El tiempo de ejecución de Lambda recibe un evento como una cadena con formato JSON y lo convierte en un objeto.

##Inyección de dependencia:
#### Desacoplar el operador new  (eliminar la instancia que crea el objeto inyectando el objeto mediante el contenedor)
1) Agregar en la clase del objeto @Component (lo hacemos así un componente que se registra en un contenedor)
2) Crear una interface con los métodos a implementar
3) Implementar en la clase del objeto la interface e implementar los métodos
4) En el controlador implementar la interfaz y no la clase.
5) Para implementar una clase especifica y llamarla correctamente en la clase del objeto en @Component agregar por parámentro un identificador de la clase : @Component("servicio")

@Autowired -> se poner arriba del método y sirve para inyectar. solo significa eso

## Ciclo de vida de un componente
Basicamente son la anotación @PostConstruct y la anotación @PreDestroy. 
Podemos implementar un método para inicializar el componente justo después de que el contenedor de spring cree una instancia de este objeto.
- @PostConstruct: Initializing a managed bean specifies the lifecycle callback method that the CDI framework should call after dependency injection but before the class is put into service. Se usa para que se ejecute algo, un método justo despues de haberse instanciado la clase

- @PreDestroy: Preparing for the destruction of a managed bean specifies the lifecycle call back method that signals that an application component is about to be destroyed by the container.Se usa para que se ejecute un método o implementar una tarea justo antes de que el objeto instanciado se destruya


#### Distintos contextos o alcances de los componentes:
el scope: es del tipo singleton, va a contener una instancia de ese componente. se aplica a los @Components y a los @controllers.


@RequestScope -> lo agregamos a la clase para que no sea singleton y sea del tipo session. Con esta etiqueta hacemos que dure la isntancia lo que dura la petición http de usuario

@SessionScope -> se usa apra amrcar nuestro objeto como de sesion, ejemplo un carro de compra o autenticación, persistencia en la session HTTP se usan sessionScope  y  tipicamente cundo trabaamos con sesiones http el alcance o el ambito del objeto , lo que dura una sesión  es desde que se inicia y se crea el componente hasta que finaliza, cuando ocurre un time out o cuando se invalida la sesión. Siempre el objeto clase componente que queramos guardar en una sesión http debe implementar la interfaz realizable poruqe cuando se transporta o almacena un objeto de java, se guardan en un contexto de ´persistencia, contexto propio de ORM, y de jpa y también necesitan implementar la interfaz serializable. La estructura seriaizada  se va a restaurar en un objeto de java, que es identico en todo sentido al original, incluso el valor de sus atributos, el estado interno

### Tips
- para caracteres especiales fiajrse que el html siempre este en utf-8. y agergar en el th:utext.
- System.out.prnintl -> atajo : syso + control + espacio