package edu.misena.relaciones.clases.model;

public class ÍtemFactura {
    private Producto producto;
    private int cantidad;

    //Constructor
    public ÍtemFactura(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //Creación Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Creación Setters
    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    //Metodo para calcular el importe de un producto
    public float calcularImporte(){
        return (float) (cantidad * producto.getPrecio());
    }

    //Metodo para mostrar informacion del item registrado.
    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }


}