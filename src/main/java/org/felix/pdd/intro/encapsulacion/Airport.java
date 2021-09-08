package org.felix.pdd.intro.encapsulacion;

public class Airport {
    String nombre;
    int capacidad;

    public void accept(FlyingTransport vehicle){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
