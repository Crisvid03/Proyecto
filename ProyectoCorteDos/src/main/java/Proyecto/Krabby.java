package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Krabby extends Pokemon {

    public Krabby() {
        super(" Krabby ", 85, Arrays.asList(
                new Ataque(" Burbuja " , 5 ) ,
                new Ataque(" Rayo Burbuja " , 8 ) ,
                new Ataque(" Placaje " , 5) ,
                new Ataque(" Tajo Cruzado " , 40 )
        ));
    }
}
