package Strategy.Frete.Singleton;

public class ConfiguracaoLoja {
    private double pacKg = 2.50;
    private double pacKm = 0.05;
    private double sedexKg = 4.00;
    private double sedexKm = 0.12;
    private double taxaUrgenciaSedex = 15.0;

    private static final ConfiguracaoLoja instancia = new ConfiguracaoLoja();

    private ConfiguracaoLoja(){

    }

    public static ConfiguracaoLoja getInstancia(){
        return instancia;
    }

    public void restaurarPadroes(){
        pacKg = 2.50;
        pacKm = 0.05;
        sedexKg = 4.00;
        sedexKm = 0.12;
        taxaUrgenciaSedex = 15.0;
    }

    public double getPacKg(){
        return pacKg;
    }

    public void setPacKg(double pacKg){
        if (pacKg < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }
        this.pacKg = pacKg;
    }

    public double getPacKm(){
        return pacKm;
    }

    public void setPacKm(double pacKm){
        if (pacKg < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }

        this.pacKm = pacKm;
    }

    public double getSedexKg(){
        return sedexKg;
    }

    public void setSedexKg(double sedexKg){
        if (pacKg < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }

        this.sedexKg = sedexKg;
    }

    public double getSedexKm(){
        return sedexKm;
    }

    public void setSedexKm(double sedexKm){
        if (pacKg < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }

        this.sedexKm = sedexKm;
    }

    public double getTaxaUrgenciaSedex(){
        return taxaUrgenciaSedex;
    }

    public void setTaxaUrgenciaSedex(double taxaUrgenciaSedex){
        if (pacKg < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }

        this.taxaUrgenciaSedex = taxaUrgenciaSedex;
    }

}
