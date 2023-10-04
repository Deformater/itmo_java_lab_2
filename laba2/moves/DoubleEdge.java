package laba2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, (int)Math.round(var2 / 3));
    }

    @Override
    protected String describe(){
        return "использует Double-Edge";
    }
}
