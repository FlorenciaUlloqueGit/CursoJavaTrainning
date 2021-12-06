package FlorenciaUlloque.app.hogar;

import FlorenciaUlloque.app.Jardin.Perro;

public class ejemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();

        Perro perr = new Perro(); //el perro no puede entrar a la casa xq no es public
        perr.jugar();

    }
}
