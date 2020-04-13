package PatternStrategy.Classes;

import PatternStrategy.Comportement.Deplacement.Deplacement;
import PatternStrategy.Comportement.EspritCombatif.CombatPistolet;
import PatternStrategy.Comportement.EspritCombatif.EspritCombatif;
import PatternStrategy.Comportement.Soin.Soin;

public class Guerrier extends Personnage {

    public Guerrier(Deplacement deplacement, EspritCombatif combat, Soin soin) {
        super(deplacement, combat, soin);
    }

    public Guerrier() {
        super();
        this.espritCombatif = new CombatPistolet();
    }
}
