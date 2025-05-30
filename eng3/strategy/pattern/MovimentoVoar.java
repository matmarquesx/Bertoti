package strategy.pattern;

public class MovimentoVoar implements Movimento {
    @Override
    public void mover() {
        System.out.println("Voando.");
    }
}