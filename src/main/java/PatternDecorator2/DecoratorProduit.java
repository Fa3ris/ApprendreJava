package PatternDecorator2;

 abstract class DecoratorProduit {
     protected DecoratorProduit p;

     abstract int getPrice();
     abstract void getInfo();

     public DecoratorProduit undoDecoration(){
         return p;
     }
}
