package PatronComposite;

public class Archivo extends Componente{
    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel) + nombre;
    }

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }
}
