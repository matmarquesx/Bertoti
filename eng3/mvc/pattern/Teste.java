package mvc.pattern;

import mvc.pattern.movimento.*;
import mvc.pattern.observer.*;
import mvc.pattern.composite.*;

public class Teste {
    public static void main(String[] args) {
        // Strategy + Observer
        Veiculo carro = new Veiculo();
        carro.setMovimento(new MovimentoAndar());
        carro.addObserver(new LogObserver());
        carro.mover();

        // Composite
        Componente motor = new Item("Motor");
        Componente roda = new Item("Roda");

        Grupo carroCompleto = new Grupo("Carro Completo");
        carroCompleto.adicionar(motor);
        carroCompleto.adicionar(roda);

        carroCompleto.exibir();
    }
}
