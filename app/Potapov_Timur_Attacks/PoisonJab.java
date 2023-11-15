package Potapov_Timur_Attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove{
    public PoisonJab(){
        super(Type.POISON,80,100);
    }
    private boolean isPoison = false;
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.poison(p);
            isPoison=true;
        }
    }
    @Override
    protected String describe(){
        return "Использует Poison Jab"+((isPoison)?"и Poison цель":"");
    }
}
