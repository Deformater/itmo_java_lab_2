package laba2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Persian extends Pokemon{
    public Persian(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(65, 70, 60, 65, 65, 115);
        // super.setMove();
    }
}
