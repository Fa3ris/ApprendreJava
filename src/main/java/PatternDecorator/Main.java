package PatternDecorator;

public class Main {

    public static void main(String[] args) {
        Affichable pointSimple = new Point(4, 4);

        Affichable croix = new Forme(pointSimple, "Croix");

        Affichable croixRouge = new Coloration(croix, "Rouge");

        pointSimple.affiche();
        croix.affiche();
        croixRouge.affiche();
        System.out.println("\n\n");
        Affichable plusAucunSens = new Forme(
                new Coloration(
                        new Coloration(
                                new Forme(
                                        new Point(2, 5), "Rectangle"),
                                "Rouge"),
                        "Bleue"),
                "Triangle");

        plusAucunSens.affiche();
    }
}
