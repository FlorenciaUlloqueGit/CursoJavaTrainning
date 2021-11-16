import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TareaTresMenu {
    public static void main(String[] args) {

        int opcionIndice = 0;


        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
            };


            // aca un if o switch para las distintas opciones.

            do{
                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");

                         opcion = JOptionPane.showInputDialog(null,
                                "Seleccione un Opción",
                                "Mantenedor de Productos",
                                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                        if (opcion == null) {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                        } else {
                            opcionIndice = opciones.get(opcion.toString());


                        };

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        opcion = JOptionPane.showInputDialog(null,
                                "Seleccione un Opción",
                                "Mantenedor de Productos",
                                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                        if (opcion == null) {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                        } else {
                            opcionIndice = opciones.get(opcion.toString());
                        }
                            break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");

                                 opcion = JOptionPane.showInputDialog(null,
                                        "Seleccione un Opción",
                                        "Mantenedor de Productos",
                                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                                if (opcion == null) {
                                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                                } else {
                                    opcionIndice = opciones.get(opcion.toString());


                                };
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Listado de usuarios ");

                               opcion = JOptionPane.showInputDialog(null,
                                        "Seleccione un Opción",
                                        "Mantenedor de Productos",
                                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                                if (opcion == null) {
                                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                                } else {
                                    opcionIndice = opciones.get(opcion.toString());


                                };
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                                break;

                        }


            } while(opcionIndice != 5);

        }
    }

