package edu.misena.relaciones.clases.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    //Creación Getters
    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    //Creación Setters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
