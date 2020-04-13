package PatternFactoryMethod2;

public class Main {

    public static void main(String[] args) {
        FactoryLogo fh = new FactoryLogoHasard();

        for (int i = 0; i < 10; i++) {
            Logo logo = fh.getLogo();
            logo.display();
        }
        System.out.println("\n\n");
        FactoryLogo fa = new FactoryLogoAlterne();

        for (int i = 0; i < 10; i++) {
            Logo logo = fa.getLogo();
            logo.display();
        }
    }
}
