package edu.misena.relaciones.clases.model;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ÍtemFactura[] items;

    public Factura(int folio, String descripcion, Date fecha, Cliente cliente, ÍtemFactura[] items){
        this.folio = folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = items;
    }

    //Creación Getters
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ÍtemFactura[] getItems() {
        return items;
    }

    //Creación Setters

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setItems(ÍtemFactura[] items) {
        this.items = items;
    }
}
