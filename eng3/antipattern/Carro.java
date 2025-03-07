package eng3.antipattern;

public class Carro extends Veiculo {
    @Override
    public void andar() {
        System.out.println("Carro está andando.");
    }

    @Override
    public void voar() {
        // Método vazio, pois carros não voam
    }
}