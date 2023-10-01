package laba2.pokemons;
import laba2.moves.MudSlap;
import laba2.moves.RapidSpin;
import laba2.moves.SkillSwap;
import laba2.moves.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Miltank extends Pokemon {
    public Miltank(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(95, 80, 105, 40, 70, 100);
        super.setMove(new RapidSpin(), new SkillSwap(), new SwordsDance(), new MudSlap());
    }
}
