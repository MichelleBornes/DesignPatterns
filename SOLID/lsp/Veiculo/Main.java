public class Main {
    
    public static void main(String[] args) {
        
        VeiculoAquatico acuatico = new Barco();
        acuatico.mover();

        VeiculoTerrestre terrestre = new Carro();
        terrestre.mover();

        terrestre = new Moto();
        terrestre.mover();
    }
}
