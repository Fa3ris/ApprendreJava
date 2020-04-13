package Thread.ThreadVerrou;

import javax.sound.midi.Soundbank;

public class Reserve extends Thread {

    private int stock = 500;

    public synchronized void retirer(int qte) throws InterruptedException {

        if (qte <= stock) {
            stock -= qte;
            System.out.println("Retrait : " + qte + " - Reste : " + stock);
//            System.out.println("Reste : " + stock);
        } else {
            System.out.println("Stock insuffisant pour retirer " + qte + " - Reste : " + stock);
            wait();
        }
    }

    public synchronized void ajouter(int qte){
        stock += qte;
        System.out.println("Ajout : " + qte + " - Reste : " + stock);
//        System.out.println("Reste : " + stock);
        notifyAll();
    }
}
