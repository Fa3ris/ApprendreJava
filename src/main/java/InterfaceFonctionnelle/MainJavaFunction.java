package InterfaceFonctionnelle;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Personne {

    private String name;

    private int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Personne(String name) {
        this.name = name;
    }

    public Personne(int age) {
        this.age = age;
    }

    public Personne() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MainJavaFunction {

    public static void main(String[] args) {


        List<Personne> people = Arrays.asList(
          new Personne("Fabrice"),
          new Personne(24),
          new Personne("Coralie", 23),
          new Personne()
        );


        Function<Personne, String> l1 = (Personne p) -> p.getName() + " Omae wa mou shindeiru";
        Function<Personne, Integer> l2 = (Personne p) -> p.getAge();
        Function<Integer, Integer> l3 = x -> x * 2;

        Consumer<Personne> c1 = (Personne p) -> p.setAge(p.getAge() + 19);
        Consumer<Personne> c2 = (Personne p) -> p.setName(p.getName() + "N. TSIAVA");

        System.out.println(l1.apply(people.get(0)));

        System.out.println(l2.andThen(l3).apply(people.get(2)));

        System.out.println(people.get(0).toString());

        c1.andThen(c2).accept(people.get(0));

        System.out.println(people.get(0).toString());





    }

}
