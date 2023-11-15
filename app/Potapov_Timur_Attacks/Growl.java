package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;
public class Growl extends PhysicalMove{
    public Growl(){
        super(Type.NORMAL,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-1);
    }
    @Override
    protected String describe(){
        return "Использовал Growl";
    }

}
