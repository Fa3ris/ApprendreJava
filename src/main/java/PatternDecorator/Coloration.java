package PatternDecorator;

public class Coloration extends Affichable {

    private Affichable p;
    private String couleur;

    public Coloration(Affichable p, String couleur) {
        this.p = p;
        this.couleur = couleur;
    }

    void affiche() {
        p.affiche();
        System.out.println("Je suis de couleur " + couleur);
    }
}
