package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Raticate  extends  Pokemon{

    public Raticate() {
        super( "Raticate ", 80, Arrays.asList(
                new Ataque(" • Hipercolmillo " , 50),
                new Ataque(" • Ataque Rápido " , 20),
                new Ataque(" • Placaje " , 12),
                new Ataque(" • Golpe Cabeza " , 15)
        ));
    }
}
