package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class Hooh extends Pokemon{
    public Hooh(String name, int level){
        super(name,level);
        setStats(106,130,90,110,154,90);
        setType(Type.FIRE,Type.FLYING);
        setMove(new AerialAce(),new FlameCharge(),new FlameThrower(),new Rest());
    }
}
