import edu.misena.relaciones.clases.model.Cliente;
import edu.misena.relaciones.clases.model.Factura;
import edu.misena.relaciones.clases.model.Producto;
import edu.misena.relaciones.clases.model.ÍtemFactura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Andrea", "12345678-9");
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i<5; i++){
            producto = new Producto("Laptop", 100.000);
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            int cantidad = s.nextInt();
            ÍtemFactura item = new ÍtemFactura(producto,2);
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}