package laba2.pokemons;

import laba2.moves.Blizzard;
import laba2.moves.HydroPump;
import laba2.moves.ThunderShock;
import laba2.moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Persian extends Pokemon{
    public Persian(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(65, 70, 60, 65, 65, 115);
        super.setMove(new HydroPump(), new ThunderWave(), new ThunderShock(), new Blizzard());
    }
}
