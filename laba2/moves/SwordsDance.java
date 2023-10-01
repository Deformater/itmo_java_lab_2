package laba2.moves;

// import ru.ifmo.se.pokemon.Pokemon;
// import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {
    public SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }

    // @Override
    // protected void applySelfEffects(Pokemon self) {
    //     double hp = self.getHP();
    //     double attack = self.getStat(Stat.ATTACK);
    //     double defence = self.getStat(Stat.DEFENSE);
    //     double speed = self.getStat(Stat.SPEED);
    //     double special_attack = self.getStat(Stat.SPECIAL_ATTACK);
    //     double special_defence = self.getStat(Stat.SPECIAL_DEFENSE);

    // }
    
    // @Override
    // protected void applyOppEffects(Pokemon opp) {
    //     double hp = opp.getHP();
    //     double attack = opp.getStat(Stat.ATTACK);
    //     double defence = opp.getStat(Stat.DEFENSE);
    //     double speed = opp.getStat(Stat.SPEED);
    //     double special_attack = opp.getStat(Stat.SPECIAL_ATTACK);
    //     double special_defence = opp.getStat(Stat.SPECIAL_DEFENSE);
        
    // }

    @Override
    protected String describe(){
        return "использует Swords Dance";
    }
}
