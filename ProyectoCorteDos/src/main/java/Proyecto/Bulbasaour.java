package Proyecto;

import java.util.Arrays;

public class Bulbasaour  extends  Pokemon{

    public  Bulbasaour (){
        super("Bulbasaour" , 130 , Arrays.asList(
                new Ataque(" latigo cepa " , 25  )  ,
                new Ataque(" Drenadoras " , 15  )  ,
                new Ataque(" Placaje  " , 5 ) ,
                new Ataque(" Somnifero " , 10 )
        ));
    }
}
