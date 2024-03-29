package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Muk extends Pokemon{
    public Muk() {
        super( " Muk ", 20, Arrays.asList(
                new Ataque(" Lodo " ,10 ) ,
                new Ataque(" Bomba lodo " , 5 ) ,
                new Ataque(" Ataque Acido " ,7 ) ,
                new Ataque(" Infortunio " , 4)
        ));
    }
}
