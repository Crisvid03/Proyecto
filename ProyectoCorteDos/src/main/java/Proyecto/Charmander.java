package Proyecto;

import java.util.Arrays;

public class Charmander extends Pokemon {
    public  Charmander() {
        super("Charmander" , 90 , Arrays.asList(
                new Ataque(" Lanzallamas " , 37 ) ,
                new Ataque(" Intimidacion " , 5)  ,
                new Ataque(" Garraz " , 8) ,
                new Ataque( "Ascuas" , 20 )
        ));
    }

}
