package Thread.ThreadVerrou;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reserve r = new Reserve();

        Thread thAjout = new ThreadAjout(100, r, 4000);
        Thread thRetrait = new ThreadRetrait(300, r, 1000);
        Thread thAjout2 = new ThreadAjout(50, r, 3000);

        Scanner sc = new Scanner(System.in);

        thAjout.start();thRetrait.start();thAjout2.start();

        sc.nextLine();

        thAjout.interrupt();thRetrait.interrupt();thAjout2.interrupt();
    }
}
