package PatternStrategy.Classes;

import PatternStrategy.Comportement.Deplacement.Deplacement;
import PatternStrategy.Comportement.EspritCombatif.EspritCombatif;
import PatternStrategy.Comportement.Soin.Soin;

public abstract class Personnage {

    protected Deplacement deplacement;

    protected EspritCombatif espritCombatif;

    protected Soin soin;

    public Personnage(Deplacement deplacement, EspritCombatif espritCombatif, Soin soin) {
        this.deplacement = deplacement;
        this.espritCombatif = espritCombatif;
        this.soin = soin;
    }

    public Personnage() {

    }

    public void seDeplacer(){

        deplacement.deplacer();
    }

    public void combattre(){

        espritCombatif.combat();
    }

    public void soigner(){
        soin.soigner();
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }
}
