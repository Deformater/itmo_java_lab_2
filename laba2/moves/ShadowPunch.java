package laba2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
    public ShadowPunch() {
        super(Type.GHOST, 60, 100);
    }

    @Override
    protected String describe(){
        return "использует Shadow Punch";
    }
}
