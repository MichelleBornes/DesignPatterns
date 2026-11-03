import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Prototype<Pedido>, Serializable {
    
    // RF05: Sequencial único
    private static long geradorId = 1; 

    private long id;
    private String cliente;
    private String enderecoEntrega;
    private List<ItemPedido> itens;
    private LocalDate criadoEm;

    
    public Pedido(String cliente, String enderecoEntrega, List<ItemPedido> itens) {
        this.id = geradorId++;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>(itens);
        this.criadoEm = LocalDate.now();
    }

    // RF06 e RF07: Construtor de cópia (Deep Copy)
    private Pedido(Pedido origem) {
        this.id = geradorId++; // Novo ID não copiado
        this.criadoEm = LocalDate.now(); // Nova data
        this.cliente = origem.cliente;
        this.enderecoEntrega = origem.enderecoEntrega;
        
        // Clonando a lista e cada item dentro dela (cópia profunda)
        this.itens = new ArrayList<>();
        for (ItemPedido item : origem.itens) {
            this.itens.add(new ItemPedido(item));
        }
    }

    @Override
    public Pedido clonar() {
        return new Pedido(this);
    }

    // RF12: Desafio - Clonagem por serialização
    public Pedido clonarPorSerializacao() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Pedido copia = (Pedido) ois.readObject();

            // RF07: Ajustando id e data pós-serialização
            copia.id = geradorId++;
            copia.criadoEm = LocalDate.now();
            return copia;
        } catch (Exception e) {
            throw new RuntimeException("Erro na serialização", e);
        }
    }

    // RF04: Valor total
    public BigDecimal valorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            total = total.add(item.subtotal());
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }

    public long getId() { return id; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(String enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }
    public List<ItemPedido> getItens() { return itens; }
    
    @Override
    public String toString() {
        return String.format("Pedido #%d | %s | %s | itens=%d | total=R$ %s", 
                id, cliente, enderecoEntrega, itens.size(), valorTotal().toString().replace(".", ","));
    }
}