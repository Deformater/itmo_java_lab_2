package laba2.pokemons;

import laba2.moves.ShadowPunch;
import laba2.moves.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Raichu extends Pokemon{
    public Raichu(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(60, 90, 55, 90, 80, 110);
        super.setMove(new ShadowPunch(), new ThunderShock());
    }
}
