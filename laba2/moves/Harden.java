package laba2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Harden extends StatusMove {
    public Harden() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe(){
        return "использует Harden";
    }
}
