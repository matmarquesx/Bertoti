package eng3.mvc.pattern.acao;

// Mapeado de mvc.pattern.movimento.MovimentoAndar
public class AcaoCaminhar implements Acao {
    @Override
    public void executar() { // Mapeado de mover()
        System.out.println("Caminhando...");
    }
}
