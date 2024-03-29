package Proyecto;

import java.util.Arrays;
import java.util.List;
public class Pikachu extends Pokemon{
    public Pikachu() {
        super("Pikachu", 100 , Arrays.asList(
                new Ataque("Impactrueno" ,   30)   ,
                new Ataque("Rayo" ,          15)   ,
                new Ataque("Ataque Rapido" , 10)   ,
                new Ataque("Placaje" ,       5)
        ));
    }
    
}
