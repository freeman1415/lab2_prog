package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class Stunky extends Pokemon{
    public Stunky(String name, int level){
        super(name,level);
        setStats(63,63,47,41,41,74);
        setType(Type.POISON,Type.DARK);
        setMove(new Swagger(),new AcidSpray(),new Snarl());
    }
}