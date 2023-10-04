package laba2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected String describe(){
        return "использует Double-Edge";
    }
}
