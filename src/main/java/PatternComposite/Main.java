package PatternComposite;

public class Main {

    public static void main(String[] args) {

        Composant c1 = new Cercle();
        Composant c2 = new Cercle();
        Composant r1 = new Rectangle();

        c1.display();
        System.out.println("\n");

        Composant g1 = new Groupe();
        g1.add(c1);
        g1.add(c2);

        Composant g2 = new Groupe();
        g2.add(c2);
        g2.add(r1);

        g1.display();
        System.out.println("\n");
        g2.display();
    }
}
