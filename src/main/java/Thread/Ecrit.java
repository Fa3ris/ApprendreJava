package Thread;

public class Ecrit extends Thread {

    private String text;
    private int nb;

    private static int attente = 5;

    public Ecrit(String text, int nb) {
        this.text = text;
        this.nb = nb;

    }

    @Override
    public void run() {
        for(int i = 0; i < nb; i++) {
            System.out.print(text);
            try {
                sleep(attente);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Ecrit e1 = new Ecrit("bonjour ", 10);
        Ecrit e2 = new Ecrit("bonsoir ", 12);
        Ecrit e3 = new Ecrit("\n", 5);

        e1.start();
        e2.start();
        e3.start();
    }

}
