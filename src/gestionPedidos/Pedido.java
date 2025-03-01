package gestionPedidos;

public class Pedido {
    private final int idProducto;
    private String descripcion;

    public Pedido(int idProducto, String descripcion) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
    }

    //Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "-Pedido #" + idProducto + ":" + descripcion;
    }
}
