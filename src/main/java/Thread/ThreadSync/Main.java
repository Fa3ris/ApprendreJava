package Thread.ThreadSync;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nombre nombre = new Nombre();

        Thread calc = new ThreadCalc(nombre);
        Thread disp = new ThreadDisplay(nombre);

        calc.start();
        disp.start();

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        calc.interrupt();
        disp.interrupt();

    }
}
