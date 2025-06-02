package eng3.strategy.pattern;

public class AcaoVoar implements Acao {
    @Override
    public void executar() {
        System.out.println("Voando.");
    }
}
