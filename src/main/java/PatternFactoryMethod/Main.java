package PatternFactoryMethod;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Logo logo = FactoryLogo.getLogo();

            logo.display();
        }
    }
}
