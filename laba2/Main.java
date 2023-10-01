package laba2;
import ru.ifmo.se.pokemon.Pokemon;
import laba2.pokemons.Miltank;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] argv){
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        Pokemon p3 = new Miltank("Абобус", 1);
        b.addAlly(p3);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
