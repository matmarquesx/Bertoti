package mvc.pattern.movimento;

public class MovimentoAndar implements Movimento {
    @Override
    public void mover() {
        System.out.println("Andando...");
    }
}
