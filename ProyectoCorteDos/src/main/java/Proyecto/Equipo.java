package Proyecto;

import java.util.ArrayList ;
import java.util.List ;
public class Equipo {
    private List<Pokemon> pokemones;
    public Equipo() {
        pokemones = new ArrayList<>() ;
    }

    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    public void eliminarPokemon(Pokemon pokemon) {
        pokemones.remove(pokemon);
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }
}