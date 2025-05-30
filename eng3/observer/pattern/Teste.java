package observer.pattern;

public class Teste {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer log = new LogObserver();

        subject.addObserver(log);
        subject.notifyObservers("Evento Aconteceu!");
    }
}
