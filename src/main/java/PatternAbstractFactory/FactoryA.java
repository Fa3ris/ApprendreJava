package PatternAbstractFactory;

public class FactoryA extends FactoryAbstract {
    Pantalon getPantalon() {
        return new PantalonSlim();
    }

    Chemise getChemise() {
        return new ChemiseCarreaux();
    }
}
