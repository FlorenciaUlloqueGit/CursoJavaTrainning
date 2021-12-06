# Paquetes

son contenedoresque nos permiten agrupar y organizar nuestras clases.

Caracteristicas: 
- agrupan y organizan nuestras clases.
- evitan conflictos de nombres entre clases.
- segun modificadores pueden ocultar el acceso a sus clases y tambien a los atributos y metodos de esas clases.
- Modificador default: solo se puede acceder en ses package y no en otros.

### Estandar en nombres de paquetes
- Deben estar escritos en minuscula completamente.
- los subpackages se separan con un punto.
- tipicamente las emnopresas usan la extension de su diminio (com org, etc)
        - ejemplo: com.google /com.facebook
        - com.florencia.Ulloque
### Definicion de paquetes
 package com.Florencia.Ulloque
 public class Persona{ ]
 ### Para usar la clase
import com.Florencia.Ulloque.Persona (habilita la clase que esta en otro paquete)


### Import estatico
import static com.Florencia.Ulloque.Saludar
sirve para improtar un metodo o atributo estatico sin usar el nombre de la clase. lo usamos como un metodo propio de la clase a pesar que no sea de la clase.

### tips
- se tradicen en carpetas y paquetes en el directorio
- si un atributo de una clase es default (no se especifica si es privado public, etc ) entonces solo podran acceder a este las clases dentro del paquete donde esta la clase que contiene al atributo default.
- si una clase tiene el identificador default y no publica entponces solo pdoran acceder a esta lasc lases que esten dentro del paquete donde esta la clase
- protecte: se puede acceder dentro del mismo package