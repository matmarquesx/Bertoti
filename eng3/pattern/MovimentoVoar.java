package eng3.pattern;

public class MovimentoVoar implements Movimento {
    @Override
    public void mover() {
        System.out.println("Voando.");
    }
}