package Scanner;

import java.util.Scanner;

public class ScannerTuto {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Veuillez saisir un mot : ");
        String str = sc.nextLine();
        System.out.println("Votre saisie : " + str);*/


        System.out.println("Saisissez un entier : ");

        int i = sc.nextInt();

        sc.nextLine();

        System.out.println("Saisissez une chaîne : ");

        String str = sc.nextLine();

        System.out.println( str + " FIN ! ");


    }
}
