package org.example.dominio;

public class Albaricoquero extends Frutal{
    private String colorCopa;
    private String tieneInjerto;
    public Albaricoquero(String nombre, String colorHoja, String colorCopa){
        super(nombre, colorHoja);
        this.tipo = "Albaricoquero";
        this.colorCopa = colorCopa;
        this.tieneInjerto = "No";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +"...";
    }
    @Override
    public void darFruto() {
        if(tieneFruto.equals("Si")){
            System.out.println(tipo + " ha dado fruto");
            tieneFruto = "No";
        }
    }
}
