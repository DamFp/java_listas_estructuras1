package gestionPedidos;

public class Test {
    public static void main(String[] args) {
        // Clientes
        Cliente cliente1 = new Cliente(001, "Andres Gonzalez");
        Cliente cliente2 = new Cliente(002, "Pablo Carbonel");
        Cliente cliente3 = new Cliente(003, "Alberto Facundo");

        // Pedidos
        Pedido pedido1 = new Pedido(101, "Portatil Asus");
        Pedido pedido2 = new Pedido(102, "Movil Sansumg");
        Pedido pedido3 = new Pedido(103, "Tablet Xiaomi");
        Pedido pedido4 = new Pedido(104, "Monitor AOI");

        cliente1.agregarPedido(pedido1);
        cliente1.agregarPedido(pedido4);
        cliente2.agregarPedido(pedido2);
        cliente3.agregarPedido(pedido3);

        System.out.println("Clientes y sus productos");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
