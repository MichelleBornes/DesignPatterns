package Singleton.SisitemaLog;

public class Logger {
    private static Logger instancia;

    private Logger(){

    }

    public static Logger getInstancia(){
        if(instancia == null){
            instancia = new Logger();
        }

        return instancia;
    }

    public void registrar(String mensagem){
        System.out.println("Log: " + mensagem);
    }
}
