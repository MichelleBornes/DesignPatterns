import java.util.HashMap;
import java.util.Map;

public class CatalogoDePedidos {
    private Map<String, Pedido> registro = new HashMap<>();

    public void registrar(String chave, Pedido modelo) {
        registro.put(chave, modelo);
    }

    public Pedido criar(String chave) {
        if (!registro.containsKey(chave)) {
            throw new IllegalArgumentException("Chave não registrada: " + chave); // RF09
        }
        // RF08: Devolve sempre uma cópia
        return registro.get(chave).clonar();
    }
}