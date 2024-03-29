package Proyecto;

import java.util.Arrays;


public class Caterpie extends  Pokemon{
    public Caterpie() {
        super("Caterpie", 180, Arrays.asList(
                new Ataque(" Placaje ", 5 ) ,
                new Ataque(" Tacleada " , 7 ) ,
                new Ataque(" Supersonico " , 18 ) ,
                new Ataque(" Drenadoras "  ,12)
        ));
    }
}
