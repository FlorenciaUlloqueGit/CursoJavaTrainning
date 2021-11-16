
import java.lang.reflect.Method;


public class ejemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "hola que tal";

       Class strClass =  texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName()); //paquete y nombre
        System.out.println("strClass.getName() = " + strClass.getSimpleName()); //no incluye el package.
        System.out.println("strClass.getPackage() = " + strClass.getPackage()); //solo el paquete.
        System.out.println("strClass = " + strClass); //imprime el nombre el package y antempone la palabra class.

        for (Method method: strClass.getMethods() ) {
            System.out.println("method.getName() = " + method.getName()); //lista todos los métodos de la clase String.
        }

        Integer num = 34;
        Class intClass = num.getClass(); //obtenemos el objeto de la clase Integer.
        Class ObjClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass); //objeto y paquete
        System.out.println("intClass = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage()); //el objeto paquete
        System.out.println("intClass = " + intClass.getPackageName()); //solo el nombre del paquete
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //la clase donde hereda la clase : NUMBER
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass()); //la clase de la clase heredada: Object.

        for (Method metodo: ObjClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
            
        }
    }

    
}
