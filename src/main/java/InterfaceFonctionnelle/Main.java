package InterfaceFonctionnelle;

public class Main {

    public static void main(String[] args) {

        /*Utilisation d'une classe anonyme*/

        InterfaceFonctionnelle myInterface = new InterfaceFonctionnelle() {

            @Override
            public void presenter(String name) {
                System.out.println("Mon nom est " + name);
            }
        };

        myInterface.presenter("Fab");



        /* Utilisation d'une Lambda*/

        InterfaceFonctionnelle lambdaInterface = (x) -> System.out.println("Je me présente, je m'appelle " + x);

        lambdaInterface.presenter("Coco");
    }
}
