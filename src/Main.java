import java.util.Scanner;
import facturacion.Factura;
import facturacion.Cliente;
import facturacion.ItemFactura;
import facturacion.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el NIF del cliente: ");
        String nifCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, nifCliente);

        System.out.print("Ingrese una descripción de la factura: ");
        String descripcionFactura = scanner.nextLine();
        Factura factura = new Factura(descripcionFactura, cliente);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del producto nº " + (i + 1) + ": ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Producto producto = new Producto(nombreProducto, precioProducto);
            ItemFactura itemFactura = new ItemFactura(producto, cantidad);
            factura.addItemFactura(itemFactura);

            System.out.println();
        }

        System.out.println(factura);
    }
}
