package Thread.ThreadSync;

public class ThreadCalc extends Thread{
    private Nombre nb;

    public ThreadCalc(Nombre nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        while(!(interrupted())){

            nb.calcul();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
