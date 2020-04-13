package PatternDecorator;

public class Forme extends Affichable {

    private Affichable p;
    private String forme;

    public Forme(Affichable p, String forme) {
        this.p = p;
        this.forme = forme;
    }

    void affiche() {
        p.affiche();
        System.out.println("Je suis de la forme " + forme);
    }
}
