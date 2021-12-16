package Set;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }


    @Override
    public int compareTo(Alumno o) {
       /*
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(o.nombre);
      */

     /*   if (this.nota == o.nota) { //ordena por nota
            return 0;
        }
        if (this.nota > o.nota) {
            return 1;
        } else  {
            return -1;
        }

      */

        if(this.nota == null){ //ordena segun notas
            return 0;
        }
        return this.nota.compareTo(o.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
   //HashCode = algoritmo que nos permite tomar datos complejos y transformarlos en un valor unico del tipo primitivo.
        return Objects.hash(nombre, nota); //si lo dejo solo con nombre va a comparar solo por  nombre
    }
}




