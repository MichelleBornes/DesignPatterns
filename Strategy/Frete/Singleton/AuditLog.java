package Strategy.Frete.Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuditLog {

    private static final AuditLog instancia = new AuditLog();

    private final List<String> registros = new ArrayList<>();

    private AuditLog(){

    }

    public static AuditLog getInstancia(){
        return instancia;
    }

    public void registrar(String mensagem){
        registros.add(mensagem);
    }

    public void exibirRegistros(){
        for (String registro : registros){
            System.out.println(registro);
        }
    }

    public void limpar(){
        registros.clear();
    }

    public List<String> getRegistros(){
        return Collections.unmodifiableList(registros);
    }
}