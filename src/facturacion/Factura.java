package facturacion;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private static int ultimoFolio = 1;
    private static final int MAX_ITEMS = 100;
    private int indiceItems = 0;

    // Constructor
    public Factura(String descripcion, Cliente cliente) {
        this.folio = ultimoFolio++;
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
    }

    // Getters y Setters
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            items[indiceItems++] = item;
        } else {
            System.out.println("No se pueden agregar más ítems a la factura.");
        }
    }

    // Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indiceItems; i++) {
            total += items[i].calcularImporte();
        }
        return total;
    }

    // Método para generar el detalle de la factura
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(fecha))
                .append("\n")
                .append("\n#\tCodigo\tNombre\tPrecio\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++) {
            sb.append(i + 1)
                    .append("\t")
                    .append(items[i])
                    .append("\n");
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
