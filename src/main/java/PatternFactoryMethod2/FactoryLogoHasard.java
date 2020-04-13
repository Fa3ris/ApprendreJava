package PatternFactoryMethod2;

public class FactoryLogoHasard extends FactoryLogo {

    public Logo getLogo() {

        double x = Math.random();
        if (x > 0.5) {
            return new LogoCercle();
        } else {
            return new LogoRectangle();
        }
    }
}
