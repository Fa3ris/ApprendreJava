package PatternAbstractFactory;

public class FactoryB extends FactoryAbstract {
    Pantalon getPantalon() {
        return new PantalonLarge();
    }

    Chemise getChemise() {
        return new ChemiseSimple();
    }
}
