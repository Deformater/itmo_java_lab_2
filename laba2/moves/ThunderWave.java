package laba2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove{
    public ThunderWave () {
        super(Type.ELECTRIC, 0, 90);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.PARALYZE).stat(Stat.SPEED, -3));
    }

    @Override
    protected String describe (){
        return "использует Thunder Wave";
    }
}