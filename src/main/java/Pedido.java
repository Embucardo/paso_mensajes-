import java.util.ArrayList;

public class Pedido {

    // Atributos privados
    private ArrayList<Producto> productos;
    private String estado;

    // Constructor
    public Pedido() {
        productos = new ArrayList<>();
        estado = "Pendiente";
    }

    // Método para agregar productos
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }

    // Método para cambiar estado
    public void cambiarEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado del pedido: " + estado);
    }

    // Getter y Setter
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // ToString
    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + productos +
                ", estado='" + estado + '\'' +
                '}';
    }
}