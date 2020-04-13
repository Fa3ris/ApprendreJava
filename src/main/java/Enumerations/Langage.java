package Enumerations;

public enum Langage {
    Java("Langage Java", 5),
    C("Langage C", 2),
    Python("Langage Python", 7),
    R("Langage R", 7),
    Javascript("Langage JavaScript", 7),
    PHP("Langage PHP", 1),
    Ruby("Langage Ruby", 1);

    private String name = "";
    private int note;

    Langage(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Langage{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
