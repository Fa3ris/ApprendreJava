package PatternDecorator2;

public class Produit extends DecoratorProduit {

    private int price;
    private String name;

    public Produit(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    void getInfo() {
        System.out.println("Produit : " + name + " - prix de base : " + getPrice());
    }


}
