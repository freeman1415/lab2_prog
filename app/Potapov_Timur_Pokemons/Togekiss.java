package Potapov_Timur_Pokemons;
import ru.ifmo.se.pokemon.*;
import Potapov_Timur_Attacks.*;
public class Togekiss extends Pokemon{
    public Togekiss(String name, int level){
        super(name,level);
        setStats(85,50,95,120,115,80);
        setType(Type.FAIRY,Type.FLYING);
        setMove(new Confide(),new Facade(),new Growl(),new WorkUp());
    }
}