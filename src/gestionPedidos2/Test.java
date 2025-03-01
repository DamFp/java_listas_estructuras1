package gestionPedidos2;

public class Test {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1201, "Monitor AOI 24' IPS");
        Pedido pedido2 = new Pedido(1202, "laptop Sansumg 15'");
        Pedido pedido3 = new Pedido(1203, "laptop Sansumg 15'");

        Cliente cliente1 = new Cliente(3001, "Juna Perez");
        Cliente cliente2 = new Cliente(3002, "Alvaro chirou");
        Cliente cliente3 = new Cliente(3003, "Perico Perez");

        cliente1.agregarPedidos(pedido1);
        cliente1.agregarPedidos(pedido2);
        cliente2.agregarPedidos(pedido2);
        cliente3.agregarPedidos(pedido3);
        cliente3.agregarPedidos(pedido1);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
