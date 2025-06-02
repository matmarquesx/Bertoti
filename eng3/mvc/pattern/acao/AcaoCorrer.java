package eng3.mvc.pattern.acao;

// Mapeado de mvc.pattern.movimento.MovimentoVoar
public class AcaoCorrer implements Acao {
    @Override
    public void executar() { // Mapeado de mover()
        System.out.println("Correndo...");
    }
}