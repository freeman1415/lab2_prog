package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;
public class AcidSpray extends SpecialMove{
    public AcidSpray(){
        super(Type.POISON,40,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE,-2);
    }
    @Override
    protected String describe(){
        return "Использует Acid Spray";
    }
}
