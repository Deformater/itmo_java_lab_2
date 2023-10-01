package laba2.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MudSlap extends SpecialMove {
    public MudSlap(){
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected String describe(){
        return "использует Mud Slap";
    }
}
