# Sobrecarga

Se refiere a la posibilidad de tener dos o más métodos con le mismo nombre pero con diferente funcionalidad.

Lo que importa son los parametros que se reciba, el tipo y cantidad de parámetros.

- varArguments: para no tener que implementar tantos métodos.
Ejemplo de varargs:
```

   public float sumar (float a, int...argumentos){ //con el tipo ... n cantidad de parametros enteros
        float total = a; //suma rel float a a la lista de enteros y retorna un float.
        for (int i : argumentos     ) {
            total += i;
        }
        return total;
    }

    public double sumar (double...argumentos){ //con el tipo ... n cantidad de parametros enteros
        double total = 0.0; //suma rel float a a la lista de enteros y retorna un float.
        for (double i : argumentos     ) {
            total += i;
        }
        return total;
    }
```
los metodos con args se trabajan como si fueran un arreglo y se declaran con el encabezado con el tipo de metodo y ...