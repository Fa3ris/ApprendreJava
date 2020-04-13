package PatternFactoryMethod2;

public class FactoryLogoAlterne extends FactoryLogo {

    public static boolean state = false;
    public Logo getLogo() {
        if(state){
            state = !state;
            return new LogoCercle();
        } else {
            state = !state;
            return new LogoRectangle();
        }
    }
}
