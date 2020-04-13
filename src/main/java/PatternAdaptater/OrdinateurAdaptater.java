package PatternAdaptater;

public class OrdinateurAdaptater implements Device {

    private Ordinateur ordinateur;

    public OrdinateurAdaptater(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    public void launch() {
        ordinateur.allumer();
    }

    public void shutdown() {
        ordinateur.eteindre();
    }

    public void unlock(int code) {
        ordinateur.deverouiller(code);
    }
}
