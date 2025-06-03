# Bertoti

Este projeto demonstra a aplicação de diversos padrões de projeto de software (Design Patterns) em Java, utilizando um contexto temático de "Organismos Biológicos" como refatoração de um código original baseado em "Veículos". O objetivo é ilustrar como os mesmos conceitos de arquitetura e padrões podem ser aplicados em diferentes domínios, mantendo a lógica e a estrutura originais.


## Padrões de Projeto Implementados

O código refatorado demonstra os seguintes padrões:

1. **Strategy:** Permite definir uma família de algoritmos (ações de um organismo), encapsular cada um deles e torná-los intercambiáveis. Visto nos pacotes `eng3.strategy.pattern` e `eng3.mvc.pattern.acao`, onde diferentes `Acao` (como `AcaoCaminhar`, `AcaoCorrer`) podem ser atribuídas a um `Organismo`.

2. **Observer:** Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto (o `SujeitoObservado`) muda de estado, todos os seus dependentes (`Observador`) são notificados e atualizados automaticamente. Implementado no pacote `eng3.observe.pattern` e integrado em `eng3.mvc.pattern.observer`, onde `Organismo` (que estende `SujeitoObservado`) notifica `RegistroAtividadeObserver` sobre suas ações.

3. **Composite:** Compõe objetos em estruturas de árvore para representar hierarquias parte-todo. Permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme. Visto em `eng3.mvc.pattern.composite`, onde `EstruturaBiologica` pode ser um `Orgao` (folha) ou um `SistemaOrganico` (grupo que contém outras `EstruturaBiologica`).

4. **MVC (Model-View-Controller) - Integração:** Embora não seja uma implementação MVC completa com UI, o pacote `eng3.mvc.pattern` (e seus subpacotes) integra os padrões Strategy, Observer e Composite para simular um sistema onde diferentes componentes interagem. `Organismo` atua como parte do *Model*, as ações (`Acao`) e estruturas (`EstruturaBiologica`) também compõem o *Model*, e `SimulacaoBiologica` em `eng3.mvc.pattern.observer` age como um *Controller/Runner* que orquestra as interações e a saída (simulando a *View*) no console.

## Estrutura do Projeto (Conforme Imagem Fornecida)

A estrutura de diretórios principal do código-fonte, baseada na imagem fornecida, é:

```
Bertoti/
└── eng3/
    ├── mvc/pattern/
    │   ├── acao/
    │   │   ├── Acao.java
    │   │   ├── AcaoCaminhar.java
    │   │   └── AcaoCorrer.java
    │   ├── composite/
    │   │   ├── EstruturaBiologica.java
    │   │   ├── Orgao.java
    │   │   └── SistemaOrganico.java
    │   └── observer/
    │       ├── Observador.java
    │       ├── RegistroAtividadeObserver.java
    │       ├── SujeitoObservado.java
    │       ├── Organismo.java
    │       └── SimulacaoBiologica.java  <-- Ponto de entrada principal
    ├── observe/pattern/
    │   ├── Observador.java
    │   ├── RegistroAtividadeObserver.java
    │   └── SujeitoObservado.java
    └── strategy/
        ├── antipattern/
        │   ├── ControleDeAcoes.java
        │   └── SimulacaoBiologicaAntipattern.java  <-- Demonstra o uso sem o padrão Strategy
        └── pattern/
            ├── Acao.java
            ├── AcaoCaminhar.java
            ├── AcaoCorrer.java
            ├── Organismo.java
            └── SimulacaoBiologica.java  <-- Ponto de entrada para teste do Strategy
```

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o JDK (Java Development Kit) instalado em seu sistema.

1. **Navegue até o diretório raiz:**  
   Abra um terminal ou prompt de comando e navegue até o diretório `ENG3` (o diretório que contém a pasta `eng3`).

2. **Compile o código:**  
   Execute o seguinte comando dentro do diretório `ENG3`:

   ```bash
   find eng3 -name "*.java" -print0 | xargs -0 javac -d .
   ```

   *Este comando compila todos os arquivos `.java` dentro da pasta `eng3` e organiza os arquivos `.class` corretamente a partir do diretório atual (`.`).*

3. **Execute a Simulação Principal:**  
   Após a compilação bem-sucedida, execute a classe principal que demonstra a integração dos padrões (localizada em `eng3.mvc.pattern.observer`):

   ```bash
   java eng3.mvc.pattern.observer.SimulacaoBiologica
   ```

4. **Execute a Simulação do Strategy:**  
   Para testar apenas o padrão Strategy isoladamente:

   ```bash
   java eng3.strategy.pattern.SimulacaoBiologica
   ```

5. **Execute a Simulação do Antipattern (Sem Strategy):**  
   Para comparar com a versão não refatorada, onde as ações não são encapsuladas como estratégias:

   ```bash
   java eng3.strategy.antipattern.SimulacaoBiologicaAntipattern
   ```

