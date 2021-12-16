

### Unit Testing JUnit
Junit nos permite escribir nuestras pruebas de testing de forma más ágil.
Automatiza y parametriza las pruebas.

##Pruebas unitarias
Son un proceso de examen para verificar que una pieza de código cumple con ciertas reglas de negocio y afirmar un resultado esperado.


##Junit
Es una librería java para escribir y ejecutar repetibles pruebas unitarias de nuestro código y ejecutarlas en la JVM.
Utiliza programación funcional y lamda e incluye varios estilos diferentes de pruebas, configuraciones, anotaciones, ciclos de vida, etc.

### Arquitectura de JUnit5
la versión anterior era monolítica, es decir, había solo un gran componente que hacía todo y estaba todo dentro del mismo componente
y finalmente era un solo Jar. En JUnit hay una arquitectura más robusta, ya que hay diferentes componentes. Tenemos un core,
tenemos el API y un componente llamado vintage.
- Plataforma JUnit 5: es la librería principal que está enfocada al contexto de ejecución del test. ES como el framework de ejecución que lanza nuestras pruebas unitarias, que pueden estar escritas usando Unit.Es el motor de ejecución de test, aca se lanzan las pruiebas unitarias mediante jupiter y con versiones mas antiguas y otros frameworks de terceros. Se adecúa a todos los IDE porque trae integración
- Junit Jupiter:  el APi júpiter nos permite interactuar como programadores. Con jupiter escribimos nuestros test. Agrega nuevo modelo y características en JUnit. Tiene nuevas anotaciones y estilos de testing y permite escribir extensiones.
- JUnit Vintage: Es un componente que nos permite integrar la versión 4 o versión 3 en un proyecto que conviva en conjunto con pruebas unitarias de la versión 5.


### Anotaciones JUnit Jupiter
- @test //
- @DispalyName // desplegar o mostrar el nombre del test
- @Nested //da una jerarquía de nuestras pruebas unitarias
- @Tag //etiquetar o categorizar
- @Extendwith //extiende de algo
- @BeforeEach //antes de un método puntual
- @AfterEach //despues de un metodo puntual
- @BeforeAll //se ejecuta antes que cualquier metodo
- @AfterAll //se ejecuta despues que cualquier método
- @Disable //deshabilita un metodo o prueba unitaria

### TIPS
- en la creación del proyecto apretar maeven.
- en la clase apretarla, alt+insert , test 
- la clase test debe llevar el nombre de la clase original + test.
- para ejecutar el test: control + shift + F10
- Prueba unitaria: prueba em la que el codigo que vamos a probar no se encuentra relacionado con el resto de las partes. forma una unidad independiente por si sola
- Desarrollo orientado a pruebas unitarias: test driven development, orientado a pruebas o a desarrollos guiados de pruebas, que es una técnica de desarrollo de sw que involucra dos partes: escribir pruebas unitarias y implementar el codigo y los metodos.
- toPlainString() //devuelve el string plano con el valor del numero al que se lo pasa
-assertAll = sirve para ejecutar varios test a la vez aunque uno de error. sino se ejecutan hasta el error
- fail()  = poara forzar el error, automaticamente falla. esde la clase assertions
- @Disabled = para deshabilitar el test
-Condicionales: pruebas unitarias que se van a ejecutar en cierto escenario.
-ciclo de vida: proceso en el cual se crea una instancia
- Assumptions: es para evaluar una expresión true o false de forma programática muy parecido al enabled pero aplicado a un codigo de forma programatica dentro de un metodo. Habilitamos o deshabilitamos una parte de un método o un método completo de acuerdo a si se cumple una condición.  
-Anidación de clases de testing: sirven para categorizar los test . se debe agregar @nested arriba de la clase
- @Tag("param") : para etiquetar un metodo o un conjunto (si etiqueto una clase) y asi solo ejecutar o diferenciar esos métodos
- para ejecutar una etiqueta en particular: entro a configuracion, editar configuraciones, elegir tag y escribir el nombre.
- Timeout : tiempo que se espera antes de producirse la falla. Se envia por parametros los segundos



### Probar test unitarios por consola sin necesidad de IDE:
1) Ir al pom
2) alt + insert : elegir plugin template
```
    <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.12.4</version>
            </plugin>
```

Para especificar que tag queremos que se ejecute agregar en configuration el nombre de la tag:
```
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.22.2</version>
<configuration>
<groups>Timeout</groups>
</configuration>
```
3) Click en la barrita que aparece en el medio del ide de maven para que se descarguen las dependencias
4) click en la barrita derecha del costdo que dice Maven.
5) click en lifeCicle y click dereccho en test 
6) apretar run 'nombre del proyecto'
7) Se crea un reporte con todas las fallas
8) el reporte esta en: target , surefire-reports


###para ejecutar en consola de windows: 
- entrar https://maven.apache.org/download.cgi#
- descargar Binary Zip archive y descomprimirlo 
- entrar a las variables de ambiente y agregar la ruta bin del proyecto y agregar una nueva variable de entorno sin el bin de la ruya al finaL
- apretar path dentro de las variables de entorno y agregar la ruta con bin
- copiar la ruta del proyecto donde sale el archivo Pom (sin el pom)
- entrar al cmd y agregar CD y la ruta copiada
- agregar luego mvn -version y dar enter (asegurarse que salga la version)
- agregar mvn test  y dar enter