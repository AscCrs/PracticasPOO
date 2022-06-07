import java.util.ArrayList;

public class PedidoSimple extends Pedido{
    public int obtener_total() {

        return 0;
    }

    public boolean cobrar() {
        return true;
    }

    public void obtener_detalles() {

    }

    public ArrayList<Cuenta> obtenerCuentas() {
        return null;
    }
}
