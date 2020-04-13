package Generics;

public class Solo<T> {

    private T valeur;

    public Solo(T valeur) {
        this.valeur = valeur;
    }

    public Solo() {
        this.valeur = null;
    }

    public T getValeur() {
        return valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }
}
