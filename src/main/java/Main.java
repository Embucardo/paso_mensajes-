public class Main {

    public static void main(String[] args) {


        Cliente cliente = new Cliente("Eddy");
        Cajero cajero = new Cajero("Carlos");
        Cocina cocina = new Cocina();


        cliente.hacerPedido();


        Pedido pedido = cajero.recibirPedido();


        Producto producto1 = new Producto("Café", 2.50);
        Producto producto2 = new Producto("Sandwich", 5.00);


        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);


        cajero.enviarACocina(pedido, cocina);


        cajero.notificarCliente();

        System.out.println("\nResumen del pedido:");
        System.out.println(pedido);
    }
}