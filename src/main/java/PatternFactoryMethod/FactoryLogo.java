package PatternFactoryMethod;

public class FactoryLogo {

    public static Logo getLogo(){
        double x = Math.random();
        if (x > 0.5) {
            return new LogoCercle();
        }
        else {
            return new LogoRectangle();
        }
    }
}
