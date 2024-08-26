package edu.misena.relaciones.clases.model;

public class Cliente {
    private String nombre;
    private String nif;   //Número de indetificación fiscal

    //Creación Getters
    public String getNombre(){
        return nombre;
    }

    public String getNif(){
        return nif;
    }

    //Creación Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNif(String nif){
        this.nif = nif;
    }
}
