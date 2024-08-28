package facturacion;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    // Constructor
    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para calcular el importe
    public double calcularImporte() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getCodigo() + "\t" + producto.getNombre() + "\t" + producto.getPrecio() + "\t" + cantidad + "\t" + calcularImporte();
    }
}
