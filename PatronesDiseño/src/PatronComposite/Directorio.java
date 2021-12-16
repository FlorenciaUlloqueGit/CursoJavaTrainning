package PatronComposite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
    private List<Componente> hijos;


    @Override
    public String mostrar(int nivel
    ) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for (Componente com: this.hijos ) {
            sb.append(com.mostrar(nivel + 1));
            if(com instanceof Archivo){
                        sb.append("\n");
            }


        }

        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if (this.nombre.equalsIgnoreCase(nombre)) {
            return true;
        }

     /*   for (Componente hijo : this.hijos) {
            if (hijo.buscar(nombre)) {
                return true;
            }
        }

      */

        return hijos.stream().anyMatch(h -> h.buscar(nombre)); //stream implementacion de arraylist pára convertir a un flujo

    }

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio agregarComponentes(Componente c){
        hijos.add(c);
        return this;
    }
    public void removeComponente(Componente c){
        hijos.remove(c);

    }

}
