package PatternAbstractFactory;

public class Main {

    public static void main(String[] args) {

        FactoryAbstract fa = new FactoryA();
        Pantalon pa = fa.getPantalon();
        Chemise ca = fa.getChemise();

        pa.coudrePantalon();
        ca.coudreChemise();

        FactoryAbstract fb = new FactoryB();
        Pantalon pb = fb.getPantalon();
        Chemise cb = fb.getChemise();

        pb.coudrePantalon();
        cb.coudreChemise();

        System.out.println("\n\n");

        FactoryAbstract f = FactoryAbstract.getFactory(true);

        f.getChemise().coudreChemise();
        f.getPantalon().coudrePantalon();

        System.out.println("\n\n");

        f = FactoryAbstract.getFactory(false);
        f.getChemise().coudreChemise();
        f.getPantalon().coudrePantalon();

    }
}
