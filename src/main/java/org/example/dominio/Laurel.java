package org.example.dominio;

public class Laurel extends Planta {
    private String colorCorteza;
    public Laurel(String nombre, String colorCorteza){
        super(nombre);
        this.tipo = "Laurel";
        this.colorCorteza = colorCorteza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "...";
    }
}
