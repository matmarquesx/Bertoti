package mvc.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void exibir() {
        System.out.println("Grupo: " + nome);
        for (Componente componente : componentes) {
            componente.exibir();
        }
    }
}
