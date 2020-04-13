package Thread;

public class EcritRunnable implements Runnable {

    private String text;
    private int nb;

    private static int attente = 5;

    public EcritRunnable(String text, int nb) {
        this.text = text;
        this.nb = nb;
    }
    public void run() {
        for(int i = 0; i < nb; i++) {
            System.out.print(text);
            try {
                Thread.sleep(attente);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){

        Thread t = new Thread(this);
        t.start();
    }
    public static void main(String[] args) {
        EcritRunnable e1 = new EcritRunnable("bonjour ", 10);
        EcritRunnable e2 = new EcritRunnable("bonsoir ", 12);
        EcritRunnable e3 = new EcritRunnable("\n", 5);


        e1.start();
        e2.start();
        e3.start();
        /*Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);

        t1.start();
        t2.start();
        t3.start();*/
    }
}
