package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Kingler extends Pokemon{
    public Kingler() {
        super( "Kingler", 100, Arrays.asList(
                new Ataque(" Hidropulso " , 29 ) ,
                new Ataque(" Rayo Burbuja " , 18 ) ,
                new Ataque(" Rayo " , 12 ) ,
                new Ataque(" Placaje " ,10 )
        ));
    }
}
