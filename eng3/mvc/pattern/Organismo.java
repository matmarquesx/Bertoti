package eng3.mvc.pattern;

import eng3.mvc.pattern.acao.Acao;
import eng3.observe.pattern.SujeitoObservado;

// Mapeado de mvc.pattern.Organismo
public class Organismo extends SujeitoObservado {
    private Acao acaoAtual;

    public void setAcaoAtual(Acao acao) {
        this.acaoAtual = acao;
    }

    public void executar() { // Mapeado de mover()
        if (acaoAtual != null) {
            acaoAtual.executar();
            notificarObservadores("Ação realizada: " + acaoAtual.getClass().getSimpleName());
        } else {
            notificarObservadores("Nenhuma ação definida.");
        }
    }
}