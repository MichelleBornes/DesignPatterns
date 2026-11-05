package Strategy.Frete;

public class Pedido {
    
    private final int id;
    private final double pesoKg;
    private final double distanciaKm;
    private final double valorItens;

    public Pedido(int id, double pesoKg, double distanciaKm, double valorItens){
        this.id = id;
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorItens = valorItens;


        if (pesoKg <= 0){
            throw new IllegalArgumentException("O peso deve ser maior que 0");
        }

        if(distanciaKm < 0){
            throw new IllegalArgumentException("Distância não pode ser negativa!");
        }
        
        if(valorItens < 0){
            throw new IllegalArgumentException("O valor dos itens não pode ser negativo!");
        }

    }

    public int getId(){
        return id;
    }

    public double getPesoKg(){
        return pesoKg;
    }

    public double getDistanciaKm(){
        return distanciaKm;
    }

    public double getValorItens(){
        return valorItens;
    }
}
