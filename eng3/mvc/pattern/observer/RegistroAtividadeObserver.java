package eng3.mvc.pattern.observer;

public class RegistroAtividadeObserver implements Observador, eng3.observe.pattern.Observador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[REGISTRO] " + mensagem);
    }
}
