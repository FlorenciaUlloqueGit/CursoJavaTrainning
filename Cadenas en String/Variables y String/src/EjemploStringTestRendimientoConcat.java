public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;


        StringBuilder sb = new StringBuilder(a); //permite crear un String y empezar a anexar con el método appen y con toString() generamos el Stirng completo. ES mutable
        long inicio = System.currentTimeMillis();

        for (int i = 0; i <500 ; i++) {
           // c = c.concat(a).concat(b).concat("\n"); //500 => 2 milisegundos
           //  c+= a+b+ "\n"; //c es igual a c + a +b + salto  //500 => 17 milisegundos de demora.
            sb.append(a).append(b).append("\n"); //tiempo de demora = 0;
        }



        long fin = System.currentTimeMillis();
        System.out.println("tiempo de demora = " + (fin - inicio)); //resto el ultimo tiempo en milisegundo
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());







    }
}
