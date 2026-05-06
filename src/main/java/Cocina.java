public class Cocina {


    public void prepararPedido(Pedido pedido) {

        System.out.println("La cocina recibió el pedido.");

        pedido.cambiarEstado("En preparación");

        System.out.println("Preparando pedido...");

        pedido.cambiarEstado("Listo");
    }


    @Override
    public String toString() {
        return "Cocina{}";
    }
}