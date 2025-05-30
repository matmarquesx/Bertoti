package mvc.pattern;

import mvc.pattern.movimento.Movimento;
import mvc.pattern.observer.Subject;

public class Veiculo extends Subject {
    private Movimento movimento;

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public void mover() {
        if (movimento != null) {
            movimento.mover();
            notifyObservers("Movimento realizado: " + movimento.getClass().getSimpleName());
        } else {
            notifyObservers("Nenhum movimento definido.");
        }
    }
}
