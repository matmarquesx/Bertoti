package eng3.strategy.pattern;

public class AcaoCaminhar implements Acao {
    @Override
    public void executar() {
        System.out.println("Caminhando.");
    }
}
