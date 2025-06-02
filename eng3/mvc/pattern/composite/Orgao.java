package eng3.mvc.pattern.composite;

public class Orgao implements EstruturaBiologica {
    private String nome;

    public Orgao(String nome) {
        this.nome = nome;
    }

    @Override
    public void descreverEstrutura() {
        System.out.println("Órgão: " + nome);
    }
}
