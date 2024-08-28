package facturacion;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    //constructor
    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    //getters y setters
    public Producto getProducto(){
        return producto;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    //metodo para calcular el importe
    public double calcularImporte(){
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString(){
        return producto + "\t" + cantidad + "\t" + calcularImporte();
    }
}
