package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class Togetic extends Pokemon{
    public Togetic(String name, int level){
        super(name,level);
        setStats(55,40,85,80,105,40);
        setType(Type.FAIRY,Type.FLYING);
        setMove(new Confide(),new Facade(),new Growl());
    }
}