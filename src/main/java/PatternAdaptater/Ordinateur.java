package PatternAdaptater;

public class Ordinateur {
    private String nom;
    private int password;

    public Ordinateur(String nom, int password) {
        this.nom = nom;
        this.password = password;
    }

    public void allumer(){
        System.out.println("Démarrage");
    }
    public void eteindre(){
        System.out.println("Extinction");
    }
    public void deverouiller(int code){
        if(code == password){
            System.out.println("Bienvenue");
        } else {
            System.out.println("Qui êtes-vous?");
        }

    }

}
