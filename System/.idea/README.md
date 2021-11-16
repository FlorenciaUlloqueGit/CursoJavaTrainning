# Clase System:

documentación: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

### Archivo de configuracion:
- final: .properties
- No tiene comillas ni caracteres especiales.
- el String va sin comillas
- se une al main de la clase.
- un mapa es como un arreglo asociativo que asocia cosas con nombres
- para crear unna variable de entorno: 
  - Entro a terminal.
  - escribo setx NOMBREVARENTORNO "holablablalbal"
  - reinicioo el ide para que la lea
  - System.gc() -> recolecta las instancias que no se usan y libera memoria. recolector de basura
- La clase runtiume permite abrir otros programas