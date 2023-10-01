package laba2.moves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RapidSpin extends PhysicalMove{
    public RapidSpin(){
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected String describe(){
        return "использует Rapid Spin";
    }
}
