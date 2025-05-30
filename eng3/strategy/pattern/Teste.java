package strategy.pattern;

public class Teste {
    public static void main(String[] args) {
        VEICULO carro = new VEICULO();
        carro.setMovimento(new MovimentoAndar());
        carro.realizarMovimento(); // Saída: Andando.

        VEICULO aviao = new VEICULO();
        aviao.setMovimento(new MovimentoVoar());
        aviao.realizarMovimento(); // Saída: Voando.
    }
}