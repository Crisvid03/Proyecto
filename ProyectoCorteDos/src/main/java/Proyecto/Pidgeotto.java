package Proyecto;

import java.util.Arrays;


public class Pidgeotto extends  Pokemon{
    public Pidgeotto() {
        super("Pidgeotto", 80, Arrays.asList(
                new Ataque(" Picotazo " ,15  ) ,
                new Ataque(" Remolino " , 20 ) ,
                new Ataque(" Tornado "  ,35  ) ,
                new Ataque(" Ataque rapido " , 10  )
        ));
    }
}
