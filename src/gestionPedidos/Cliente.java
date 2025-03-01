package gestionPedidos;

import java.util.ArrayList;

public class Cliente {
    private final int idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    //Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidos () {
        return pedidos;
    }

    public void agregarPedido (Pedido pedido){
        pedidos.add(pedido);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombre).append(" (ID: ").append(idCliente).append(")\n");
        for (Pedido pedido : pedidos) {
            sb.append("  ").append(pedido).append("\n");
        }
        return sb.toString();
    }
}
