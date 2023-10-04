package laba2.pokemons;

import laba2.moves.DoubleEdge;
import laba2.moves.Harden;
import laba2.moves.ShadowPunch;
import laba2.moves.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sandshrew extends Pokemon{
    public Sandshrew(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(50, 75, 85, 20, 30, 40);
        super.setMove(new ShadowPunch(), new ThunderShock(), new DoubleEdge(), new Harden());
    }
}
