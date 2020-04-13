package PatternDecorator2;

public class Main {


    public static void main(String[] args) {
        DecoratorProduit pdt = new OptionEmballage(new OptionLivraison(new Produit(100, "jeu"), 20), 10);
        pdt.getInfo();

        System.out.println("\n");

        DecoratorProduit pdt2 = new Produit(50, "chair");
        pdt2 = OptionEmballage.setEmballage(pdt2, 40);
        pdt2 = OptionLivraison.setLivraison(pdt2, 200);

        pdt2.getInfo();

        pdt2.undoDecoration();

        pdt2.getInfo();
    }
}
