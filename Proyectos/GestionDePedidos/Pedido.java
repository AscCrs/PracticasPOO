import java.util.ArrayList;

public class Pedido {
    private int total;
    private EstadoPedido estado;

    public boolean cobrar() {
    
    
        return true;
    }

    public void servir() {

    }

    public void confirmar() {

    }

    public int obtener_Total(){

        return 0;
    }

    public void obtener_Detalle() {

    }

    public ArrayList<Cuenta> obtener_cuentas() {
        return null;
    }

    public boolean anadirProducto(Producto p, int num) {
        return true;
    }
}
