package laba2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sandshrew extends Pokemon{
    public Sandshrew(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(50, 75, 85, 20, 30, 40);
        // super.setMove();
    }
}
