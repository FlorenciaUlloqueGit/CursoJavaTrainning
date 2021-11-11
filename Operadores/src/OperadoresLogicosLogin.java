import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

 /*
        String[] usuarios = new String[2];
        String[] contraseña = new String[2];

        usuarios[0] = "Florencia";
        contraseña[0] = "12345";

        usuarios[1] = "admin";
        contraseña[1] = "123";
 */
        String[] usuarios = {"Florencia", "admin", "Carlos"};
        String[] contraseña = {"12345", "lelele", "itt"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el usuario");
        String user = scanner.nextLine();

        System.out.println("ingrese una contraseña");
        String p = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < usuarios.length; i++) {
            esAutenticado = usuarios[i].equals(user) && contraseña[i].equals(p) ? true : false;
            //if (usuarios[i].equals(user) && contraseña[i].equals(p)) {
            // esAutenticado = true;
            //break;
        }


        String mensaje = esAutenticado ? "Buenvenido usuario".concat(user).concat("!") :
                "usuario o contraseña incorrectos";

        System.out.println("mensaje = " + mensaje);
    }
    }

        /*if(username.equals(user) && Password.equals(p) ||
                username2.equals(user) && contra2.equals(p) ){
          esAutenticado = true;
        }
          */

          /*  if(esAutenticado) {
                System.out.println(user.concat(", Ingresó correctamente al sistema"));
            } else {
                System.out.println("Lo siento, usuario o contraseña inexistentes");
            }
              }
           */

