package FlorenciaUlloque.app.Jardin;

import FlorenciaUlloque.app.hogar.Persona;

class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
