package Potapov_Timur_Attacks;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
    public AerialAce(){
        super(Type.FLYING,60,0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
    @Override
    protected String describe(){
        return "Использует Aerial Ace";
    }
}
