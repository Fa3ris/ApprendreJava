package Thread.ThreadVerrou;

public class ThreadRetrait extends Thread {

    private int quantite;
    private Reserve r;
    private long attente;

    public ThreadRetrait(int quantite, Reserve r, long attente) {
        this.quantite = quantite;
        this.r = r;
        this.attente = attente;

    }

    @Override
    public void run() {
        while (!interrupted()) {
            try {
                r.retirer(quantite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                sleep(attente);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}