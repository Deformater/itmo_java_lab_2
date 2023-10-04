package laba2.moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove{
    public ThunderWave () {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected String describe (){
        return "использует Thunder Wave";
    }
}