package PatternAbstractFactory;

public abstract class FactoryAbstract {
    abstract Pantalon getPantalon();

    abstract Chemise getChemise();


    public static FactoryAbstract getFactory(boolean state) {

        return state ? new FactoryA() : new FactoryB();
    }
}
