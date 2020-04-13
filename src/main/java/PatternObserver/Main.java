package PatternObserver;

public class Main {

    public static void main(String[] args) {

        Observateur observateur = new Cabine();

        Observable observable = new Capteur();

        observable.addObservateur(observateur);

        observable.notifyObservateurs();
        observable.removeObservateur(observateur);

        System.out.println("retry");
        observable.notifyObservateurs();

    }
}
