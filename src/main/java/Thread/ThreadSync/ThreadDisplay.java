package Thread.ThreadSync;

public class ThreadDisplay extends Thread{

    private Nombre nb;

    public ThreadDisplay(Nombre nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        while (!(interrupted())){

            nb.display();
            try {
                sleep(75);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
