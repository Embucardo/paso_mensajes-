public class Cliente {


    private String nombre;


    public Cliente(String nombre) {
        this.nombre = nombre;
    }


    public void hacerPedido() {
        System.out.println(nombre + " está realizando un pedido.");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}