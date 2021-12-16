package Tarea;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaYHora;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaYHora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaYHora = fechaYHora;
        this.pasajeros = pasajeros;
    }

    public Vuelo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaYHora=" + fechaYHora +
                ", pasajeros=" + pasajeros +
                '}';
    }

    public int compareTo(Vuelo v) {


        if(this.fechaYHora == null){ //ordena segun notas
            return 0;
        }
        return this.fechaYHora.compareTo(v.fechaYHora);
    }

}
