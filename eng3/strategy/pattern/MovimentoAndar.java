package strategy.pattern;

public class MovimentoAndar implements Movimento {
    @Override
    public void mover() {
        System.out.println("Andando.");
    }
}