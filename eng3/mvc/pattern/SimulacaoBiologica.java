package eng3.mvc.pattern;

import eng3.mvc.pattern.acao.*;
import eng3.mvc.pattern.observer.*;
import eng3.mvc.pattern.composite.*;

// Mapeado de mvc.pattern.Teste
public class SimulacaoBiologica {
    public static void main(String[] args) {
        // Strategy + Observer (no contexto biológico)
        Organismo organismoTerrestre = new Organismo();
        organismoTerrestre.setAcaoAtual(new AcaoCaminhar());
        organismoTerrestre.adicionarObservador(new RegistroAtividadeObserver());
        System.out.println("--- Testando Organismo Terrestre (Strategy + Observer) ---");
        organismoTerrestre.executar();

        System.out.println("\n--- Testando Organismo Voador (Strategy + Observer) ---");
        Organismo organismoVoador = new Organismo();
        organismoVoador.setAcaoAtual(new AcaoCorrer());
        organismoVoador.adicionarObservador(new RegistroAtividadeObserver());
        organismoVoador.executar();

        // Composite (no contexto biológico)
        System.out.println("\n--- Testando Estrutura Biológica (Composite) ---");
        EstruturaBiologica coracao = new Orgao("Coração");
        EstruturaBiologica pulmao = new Orgao("Pulmão");

        SistemaOrganico sistemaCirculatorio = new SistemaOrganico("Sistema Circulatório");
        sistemaCirculatorio.adicionarEstrutura(coracao);

        SistemaOrganico sistemaRespiratorio = new SistemaOrganico("Sistema Respiratório");
        sistemaRespiratorio.adicionarEstrutura(pulmao);

        SistemaOrganico organismoComplexo = new SistemaOrganico("Organismo Complexo");
        organismoComplexo.adicionarEstrutura(sistemaCirculatorio);
        organismoComplexo.adicionarEstrutura(sistemaRespiratorio);
        organismoComplexo.adicionarEstrutura(new Orgao("Cérebro")); // Adicionando um órgão diretamente

        organismoComplexo.descreverEstrutura();
    }
}