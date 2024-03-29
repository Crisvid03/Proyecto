package Proyecto;

import java.util.Arrays;

public class Squirtle extends  Pokemon{
    public Squirtle(){
        super(" Squirtle " , 170 , Arrays.asList(
                new Ataque(" Pistola Agua ", 10),
                new Ataque(" Burbuja ", 7 ),
                new Ataque(" Ataque Rápido ", 6),
                new Ataque(" Placaje ", 4)
        ));
    }

}
