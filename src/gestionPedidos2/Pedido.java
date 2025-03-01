package gestionPedidos2;

public class Pedido {
    private int numPedido;
    private String descripcion;

    public Pedido (int numPedido, String descripcion) {
        this.numPedido = numPedido;
        this.descripcion = descripcion;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "-Pedido #" + numPedido + ":" + descripcion;
    }
}
