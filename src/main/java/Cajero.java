public class Cajero {


    private String nombre;


    public Cajero(String nombre) {
        this.nombre = nombre;
    }


    public Pedido recibirPedido() {

        System.out.println(nombre + " está registrando el pedido.");

        Pedido pedido = new Pedido();

        return pedido;
    }


    public void enviarACocina(Pedido pedido, Cocina cocina) {

        System.out.println(nombre + " envió el pedido a cocina.");

        cocina.prepararPedido(pedido);
    }


    public void notificarCliente() {

        System.out.println("Cajero: Su pedido está listo.");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ToString
    @Override
    public String toString() {
        return "Cajero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}