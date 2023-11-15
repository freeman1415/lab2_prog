package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;

public class FlameThrower extends SpecialMove{
    public FlameThrower(){
        super(Type.FIRE,90,100);
    }
    private boolean isBurned = false;
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.1){
            isBurned = true;
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "Использует Flame thrower "+((isBurned)? "и burn цель":"");
    }

}
