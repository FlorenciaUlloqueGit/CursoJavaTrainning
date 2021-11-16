 import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        // String[] nombres = new String[6];
      String nombres[] = {"Andres", "Pepe", "María", "Paco", "Pepa"};
      int count = nombres.length; // + optimizado
      for (int i = 0; i< count; i++){
          if(nombres[i].equalsIgnoreCase("andres") ||
          nombres[i].equalsIgnoreCase("pepa")){
              continue;
          }
          System.out.println("nombres = " + nombres[i]);
      }
      String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }

        if(encontrado) {
           JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }

            else {
                JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");

            }
        }
    }

