public class Aplicacao {
    
    ILogger logger;

    public Aplicacao(ILogger logger){
        this.logger = logger;
    }

    public void aplicar(String mensagem){
        logger.registrar(mensagem);
    }
}
