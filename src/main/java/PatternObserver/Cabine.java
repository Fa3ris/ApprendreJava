package PatternObserver;

public class Cabine implements Observateur {

    @Override
    public void notifier() {
        System.out.println("msg received by cabin");
    }
}
