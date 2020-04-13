package PatternAdaptater;

public class Main {

    public static void main(String[] args) {

        Ordinateur o = new Ordinateur("fab", 0x1);

        OrdinateurAdaptater adaptater = new OrdinateurAdaptater(o);

        adaptater.launch();
        adaptater.unlock(10);
        adaptater.unlock(0x1);
        adaptater.shutdown();
    }
}
