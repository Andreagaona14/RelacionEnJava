package edu.misena.relaciones.clases.model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ÍtemFactura[] items;


    private static int ultimoFolio = 0;
    private static final int MAX_ITEMS = 10;
    private int indiceItem = 0;

    //Constructor
    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.cliente = cliente;
        this.items = new ÍtemFactura[MAX_ITEMS];

        //Incrementacion del ultimo folio
        ultimoFolio++;
        this.folio = ultimoFolio;
    }

    //Metodo para añadir items a la factura
    public void addItemFactura(ÍtemFactura item){
        if(indiceItem < MAX_ITEMS){
            items[indiceItem] = item;
            indiceItem++;
        }else{
            System.out.println("Alcanzaste el limite maximo permitido");
        }
    }

    /*
     * Calcula el importe total de la factura sumando el importe de cada ítem en la lista.
     *
     * @return el importe total de la factura, como un valor de tipo {@code float}.
     * Si la lista de ítems está vacía o todos los ítems son {@code null}, el valor retornado será 0.0.
     */

    public float calcularTotal() {
        float total = 0;
        for (ÍtemFactura item : items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    // prepara el detalle de la factura
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\tCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(ÍtemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item)
                    .append("\t");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}