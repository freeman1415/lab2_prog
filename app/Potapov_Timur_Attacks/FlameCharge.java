package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove{
    public FlameCharge(){
        super(Type.FIRE,50,100);
    }
    @Override
    protected void applySelfEffects(Pokemon a){
        a.setMod(Stat.SPEED, +1);
    }

    @Override
    protected String describe(){
        return "Использует Flame Charge";
    }
}

