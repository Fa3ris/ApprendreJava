package PatternObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable {

    private List<Observateur> lesObservateurs;

    public Observable() {
        lesObservateurs = new ArrayList<Observateur>();
    }

    public void addObservateur(Observateur obs){
        lesObservateurs.add(obs);
    }

    public void removeObservateur (Observateur obs){
        lesObservateurs.remove(obs);
    }

    public void notifyObservateurs (){
        Iterator<Observateur> it = lesObservateurs.iterator();

        while(it.hasNext()){
            Observateur obs = it.next();

            obs.notifier();

        }
    }
}
