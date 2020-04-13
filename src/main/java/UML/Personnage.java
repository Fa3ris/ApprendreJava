package UML;

public class Personnage {

    protected Arme arme =  new Arme();

    protected Accessoire[] lesAccessoires =  new Accessoire[5];

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Accessoire[] getLesAccessoires() {
        return lesAccessoires;
    }

    public void setLesAccessoires(Accessoire[] lesAccessoires) {
        this.lesAccessoires = lesAccessoires;
    }
}
