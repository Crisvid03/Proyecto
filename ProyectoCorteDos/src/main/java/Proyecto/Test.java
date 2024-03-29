package Proyecto;

public class Test {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu() ;
        Caterpie caterpie = new Caterpie() ;
        Pidgeotto pidgeotto = new Pidgeotto() ;
        Bulbasaour bulbasaour = new Bulbasaour() ;
        Charmander charmander = new Charmander() ;
        Squirtle squirtle = new Squirtle() ;
        Krabby krabby = new Krabby() ;
        Raticate raticate = new Raticate() ;
        Muk muk = new Muk() ;
        Kingler kingler = new Kingler() ;

        Equipo equipo1 = new Equipo() ;
        equipo1.agregarPokemon(pikachu) ;
        equipo1.agregarPokemon(charmander) ;
        equipo1.agregarPokemon(raticate) ;

        Equipo equipo2 = new Equipo() ;
        equipo2.agregarPokemon(kingler) ;
        equipo2.agregarPokemon(squirtle) ;
        equipo2.agregarPokemon(krabby) ;

        BatallaPokemon batalla = new BatallaPokemon(equipo1, equipo2);
        batalla.simularBatalla();
    }
}
