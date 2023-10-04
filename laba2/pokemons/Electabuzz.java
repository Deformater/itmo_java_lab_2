package laba2.pokemons;

import laba2.moves.HydroPump;
import laba2.moves.ThunderShock;
import laba2.moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Electabuzz extends Pokemon{
    public Electabuzz(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(65, 83, 57, 95, 85, 105);
        super.setMove(new HydroPump(), new ThunderWave(), new ThunderShock());
    }
}
