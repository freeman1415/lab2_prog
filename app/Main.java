import Potapov_Timur_Attacks.*;
import Potapov_Timur_Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        Hooh p1 = new Hooh("Птица",1);
        Togepi p2 =new Togepi("Милое яйцо",1);
        Togetic p3 = new Togetic("Летающее яйцо",1);
        Togekiss p4 = new Togekiss("Крутое яйцо",1);
        Stunky p5 = new Stunky("Скунс",1);
        SkunTank p6 = new SkunTank("Крутой скунс",1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}