package eng3.observe.pattern;

public class RegistroAtividadeObserver implements Observador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[REGISTRO] " + mensagem);
    }
}
