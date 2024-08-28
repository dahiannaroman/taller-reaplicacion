package facturacion;

public class Cliente {
    private String nombre;
    private String nif;

    //constructor
    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;

    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}


