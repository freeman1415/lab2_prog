package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Status.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL,70,100);
    }
    private boolean isPowerDoubles = false;
    @Override
    protected void applyOppDamage(Pokemon p,double damage){
        Status Pokcon = p.getCondition();
        if (Pokcon==(Status.BURN) || Pokcon==(Status.POISON) || Pokcon==(Status.PARALYZE)){
            isPowerDoubles = true;
            p.setMod(Stat.HP,(int)Math.round(damage)*2);
        }
    }
    @Override
    protected String describe(){
        return "Использует Facade "+((isPowerDoubles)?"Power удвоена":"");
    }


}
