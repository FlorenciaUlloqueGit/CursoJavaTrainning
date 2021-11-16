
# WRAPPER:
anvuelven y anidan el valor primitivo en forma de objeto para darle mayor funcionalidad, para comprobar, validar y convertir datos a tipos compatibles.
son tipos de datos de referencia basados en primitivos.

Cada  tipo primitivo tiene su equivalente en tipo de referencia o clase. Dan mayor funcionalidad para operaciones de comprobaciones y de conversiones.
- PRIMITIVO /EQUIVALENTE
- byte ->  Byte.
- short -> Short.
- int -> Integer.
- long -> Long.
- float -> Float.
- double -> Double.
- char -> Character.
- boolean -> Boolean.

##Integer: 
La clase int pertenece a la  clase de objetos Integer y se implementan varios métodos útiles dentro de la calse envoltorio Integer.
  Conversión de datos:

 ```
 Integer i = Integer.valueOf(1234);
 String s = i.toString();
 int j = i.intValue;
 long L = i.longValue();
 float f = i.floatValue();
 double d = i.doubleValue();
 int k = Integer.parseInt ("3453453");
```
- Constantes de Integer:
- Integer.MIN_VALUE;
- Integer.MAX_VALUE;
  
- Métodos estáticos:
  - String Integer.toString(int i, int base);
  - String Integer.toString(int i);
  - int Integer.parseInt(String s, int base);
  - int Integer.parseInt (String s);
  - Integer Integer.valueOf(String s, int base) //retorna una instancia de un objeto
  - Integer Integer.valueOf(String s)
    
- Métodos de la instancia: 
  - int intValue();
  - long longValue();
  - float floatValue();
  - double doubleValue();
  - String toString();
  - int hashCode();
  - boolean equals(Object obj);
  - byte byteValue();
  - short shortValue();
  

## Long:
la clase Long tiene la clase de objetos Long. 
 ```
 Long l = Long.valueOf(323423414159l); //cre auna clase objeto Long
 String s = d.toString();
 int i = d.intValue;
 long j = d.longValue();
 float f = dfloatValue();
 double d = d.doubleValue();
 long k =Double.parseDouble ("3453453453453453");
```
- Constantes de Long :
  - Long.MIN_VALUE;
  - Long.MAX_VALUE;

- Métodos de la instancia:
  - int intValue();
  - long longValue();
  - float floatValue();
  - double doubleValue();
  - String toString();
  - int hashCode();
  - boolean equals(Object obj);
  - byte byteValue(); //ojo con estos , el num debe ser menor al tamaño maz aceptado
  - short shortValue();


## Double:
 ```
Double d = Double.valueOf((3.14159); //cre auna clase objeto Long
String s = d.toString();
int i = d.intValue;
long j = d.longValue();
float f = d.floatValue();
double d = d.doubleValue();
long k = Double.parseInt ("(314159e-2");
```
- Constantes de Long :
  - Double.MIN_VALUE;
  - Double.MAX_VALUE;
  - Double.Positive.Infinity;
  - Double.NEGATIVE.Infinity;

- Métodos de la instancia:
  - int intValue();
  - long longValue();
  - float floatValue();
  - double doubleValue();
  - String toString();
  - int hashCode();
  - boolean equals(Object obj);
  - byte byteValue(); //ojo con estos , el num debe ser menor al tamaño maz aceptado
  - short shortValue();

- Métodos estáticos
  - Double Double.valueOf(String s);
  - Double Double.ValueOf(Double d);
  - double Double.parseDouble(String s);
  - String Double.toString (double d);
  - boolean Double.isNaN(d);
  - boolean Double.isInfinite(d);
  - long Double.doubleToLongBits(d);
  - double Double.longsBitsToDouble(l);

## Float: 
 ```
Float f = Float.valueOf((3.14159); //cre auna clase objeto Long
String s = f.toString();
int i = f.intValue;
long l = f.longValue();
float j = f.floatValue();
double d = f.doubleValue();
float k = Float.parseInt ("(314159e-2");
```
## Character:
 ```
Character c = Character.valueOf('a'); //cre auna clase objeto Long
String s = c.toString();
char c2 = c.char.Value();
char c3 = Character.toLowerCase(c);
Boolean b = Character.isDigit(c);
Boolean b2 = Character.isAlphabetic(c);
Boolean b3 = Character.isUpperCase(c);
Boolean b4 = Character.isLowerCase(c);
Boolean b5 = Character.isLetter(c);
Boolean b6 = Character.isSpaceChar(c);
Boolean b7 = Character.isSpaceChar(' ');;
Boolean b8 = Character.isDigit('7');

```
Métodos de la instancia:

- String toString();
- char charValue();
- boolean equals(Object obj);


## Boolean 
```
Boolean c = Boolean.valueOf(true); //lo convierte a un objeto
Boolean c2 = Boolean.valueOf("true");
String s = c.toString();
boolean c3 = c.booleanValue(); //lo convierte a un primitivo.
```

- Constantes:
  - Boolean.TRUE;
  - boolean.FALSE;
  
- Métodos estáticos:
  - boolean booleanValue();
  - String toString();
  - boolean equals(Object obj);

