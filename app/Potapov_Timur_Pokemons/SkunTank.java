package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class SkunTank extends Pokemon{
    public SkunTank(String name, int level){
        super(name,level);
        setStats(103,93,67,71,61,84);
        setType(Type.DARK,Type.POISON);
        setMove(new Swagger(),new Snarl(),new AcidSpray(),new PoisonJab());
    }
}