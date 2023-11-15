package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class Togepi extends Pokemon{
    public Togepi(String name, int level){
        super(name,level);
        setStats(35,20,65,40,65,20);
        setType(Type.FAIRY);
        setMove(new Confide(),new Facade());
    }
}