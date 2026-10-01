public class Main {
    
    public static void main(String[] args) {
        
        Veiculo veiculoCarro = new Carro();
        veiculoCarro.tipo();

        Dirigivel carro = new Carro();
        carro.dirigir();

        Veiculo veiculoMoto = new Moto();
        veiculoMoto.tipo();

        Dirigivel moto = new Moto();
        moto.dirigir();

        Veiculo veiculoBarco = new Barco();
        veiculoBarco.tipo();

        Navegavel barco = new Barco();
        barco.navegar();
        

    }
}
