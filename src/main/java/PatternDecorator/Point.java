package PatternDecorator;

public class Point extends Affichable {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void affiche() {
        System.out.println("Je suis au point (" + x + ", " + y + ")");
    }
}
