package PatternDecorator2;

public class OptionEmballage extends DecoratorProduit {

    private int price;

    public OptionEmballage(DecoratorProduit p, int price) {
        this.p = p;
        this.price = price;
    }

    int getPrice() {
        return p.getPrice() + price;
    }

    void getInfo() {
        p.getInfo();
        System.out.println("Option emballage : " + price);
        System.out.println("Total : " + getPrice());
    }

    public static DecoratorProduit setEmballage(DecoratorProduit p, int priceEmballage) {
        return new OptionEmballage(p, priceEmballage);
    }
}
