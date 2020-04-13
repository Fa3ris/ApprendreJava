package PatternDecorator2;

public class OptionLivraison extends DecoratorProduit {
private int price;

    public OptionLivraison(DecoratorProduit p, int price) {
        this.p = p;
        this.price = price;
    }

    int getPrice() {
        return p.getPrice() + price;
    }

    void getInfo() {
        p.getInfo();
        System.out.println("Option livraison : " + price);
        System.out.println("Total : " + getPrice());
    }

    public static DecoratorProduit setLivraison(DecoratorProduit p, int priceLivraison){
        return new OptionLivraison(p, priceLivraison);
    }
}
