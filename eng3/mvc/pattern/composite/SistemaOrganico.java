package eng3.mvc.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class SistemaOrganico implements EstruturaBiologica {
    private String nome;
    private List<EstruturaBiologica> estruturas = new ArrayList<>();

    public SistemaOrganico(String nome) {
        this.nome = nome;
    }

    public void adicionarEstrutura(EstruturaBiologica estrutura) {
        estruturas.add(estrutura);
    }

    @Override
    public void descreverEstrutura() {
        System.out.println("Sistema Orgânico: " + nome);
        for (EstruturaBiologica estrutura : estruturas) {
            estrutura.descreverEstrutura();
        }
    }
}
