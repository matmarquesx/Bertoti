package eng3.strategy.pattern;

public class SimulacaoBiologica {
    public static void main(String[] args) {
        Organismo mamifero = new Organismo();
        mamifero.setAcaoAtual(new AcaoCaminhar());
        mamifero.executarAcao(); // Saída: Caminhando.

        Organismo ave = new Organismo();
        ave.setAcaoAtual(new AcaoVoar());
        ave.executarAcao(); // Saída: Voando.
    }
}
