package eng3.strategy.pattern;

public class Organismo {
    private Acao acaoAtual;

    public void setAcaoAtual(Acao acao) {
        this.acaoAtual = acao;
    }

    public void executarAcao() {
        if (acaoAtual != null) {
            acaoAtual.executar();
        } else {
            System.out.println("Nenhuma ação definida.");
        }
    }
}
