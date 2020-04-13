package PatternComposite;

public abstract class Composant {

    public abstract void display();

    /*méthode add n'a pas de définition exprès, les classes Cercle et Rectangle n'ont donc pas à la définir*/
    public void add(Composant c) {
    }
}
