public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break; //el breack sale del switch
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es tres");
                break;
            default:
                System.out.println("número o caracter desconocido");
                break;

        }
        String nombre = "andres";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin");
                break;
            case "andres":
                System.out.println("hola andres");
                break;
            case "Florencia":
                System.out.println("Hola flor");
                break;
            default:
                System.out.println("el nombre ingresado no se conoce");
                break;

        }

        int mes = 12;
        String nombreMes = null;

        switch (mes){
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("el número ingresado no corresponde a ningún mes");
                break;
        }

    }
}
