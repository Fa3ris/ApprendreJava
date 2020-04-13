package Thread.ThreadVerrou;

public class ThreadAjout extends Thread {

    private int quantite;
    private Reserve r;
    private long attente;

    public ThreadAjout(int quantite, Reserve r, long attente) {
        this.quantite = quantite;
        this.r = r;
        this.attente = attente;

    }

    @Override
    public void run() {
        while (!interrupted()) {
            r.ajouter(quantite);
            try {
                sleep(attente);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
