package PatternComposite;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Composant {

    private List<Composant> lesComposants = new ArrayList<Composant>();

    public void display() {
        for(Composant c: lesComposants){
            c.display();
        }
    }

    @Override
    public void add(Composant c) {
        lesComposants.add(c);
    }
}
