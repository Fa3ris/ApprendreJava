package Thread.ThreadSync;

public class Nombre {
    private int n = 0, carre;

    public synchronized void calcul(){
        n++;
        carre = n*n;
    }

    public synchronized void display(){
        System.out.println(n + "² = " + carre);
    }
}
