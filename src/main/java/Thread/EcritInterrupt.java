package Thread;

import java.util.Scanner;

import static java.lang.Thread.interrupted;

public class EcritInterrupt implements Runnable {


    private String text;

    private int attente;

    public EcritInterrupt(String text, int attente) {
        this.text = text;
        this.attente = attente;
    }

    public void run() {
        while (true) {

            if (interrupted()) return;

            System.out.print(text);
            try {
                Thread.sleep(attente);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void start() {

        Thread t = new Thread(this);
        t.start();
    }

    public static void main(String[] args) {
        EcritInterrupt e1 = new EcritInterrupt("bonjour ", 10);
        EcritInterrupt e2 = new EcritInterrupt("bonsoir ", 12);
        EcritInterrupt e3 = new EcritInterrupt("\n", 5);


        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);

        t1.start();
        t2.start();
        t3.start();

        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("\n Arret thread 1");
        t1.interrupt();
        sc.nextLine();
        t2.interrupt();
        t3.interrupt();
        System.out.println("\n Arret threads 2 et 3");
    }

}
