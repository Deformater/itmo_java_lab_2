package laba2.moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Harden extends StatusMove {
    public Harden() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "использует Harden";
    }
}
