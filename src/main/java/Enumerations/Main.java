package Enumerations;

public class Main {

    public static void main(String[] args) {
        for (Langage lang : Langage.values()) {
            System.out.println(lang);
//            System.out.println(lang.getName());
//            System.out.println(lang.getNote());
        }
    }
}
