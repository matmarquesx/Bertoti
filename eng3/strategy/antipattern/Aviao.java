package strategy.antipattern;

public class Aviao extends Veiculo {
    @Override
    public void andar() {
        // Método vazio, pois aviões não andam
    }

    @Override
    public void voar() {
        System.out.println("Avião está voando.");
    }
}