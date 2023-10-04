package laba2.pokemons;

import laba2.moves.DoubleEdge;
import laba2.moves.ShadowPunch;
import laba2.moves.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Omastar extends Pokemon{
    public Omastar(String name, int level){
        super(name, level);
        super.setType(Type.ROCK, Type.WATER);
        super.setStats(70, 60, 125, 115, 70, 55);
        super.setMove(new ShadowPunch(), new ThunderShock(), new DoubleEdge());
    }
}
