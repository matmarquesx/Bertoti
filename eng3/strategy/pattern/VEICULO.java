package strategy.pattern;

public class VEICULO {
    private Movimento movimento;

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public void realizarMovimento() {
        if (movimento != null) {
            movimento.mover();
        } else {
            System.out.println("Nenhum movimento definido.");
        }
    }
}