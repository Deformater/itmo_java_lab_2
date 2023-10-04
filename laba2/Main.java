package laba2;
import ru.ifmo.se.pokemon.Pokemon;
import laba2.pokemons.Electabuzz;
import laba2.pokemons.Miltank;
import laba2.pokemons.Omastar;
import laba2.pokemons.Persian;
import laba2.pokemons.Raichu;
import laba2.pokemons.Sandshrew;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] argv){
        Battle b = new Battle();

        Pokemon p1 = new Miltank("Танк", 1);
        Pokemon p2 = new Electabuzz("Элетробус", 1);
        Pokemon p3 = new Persian("Принц персии", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        Pokemon p4 = new Raichu("Рецу", 1);
        Pokemon p5 = new Omastar("Старец", 1);
        Pokemon p6 = new Sandshrew("Песчанный хрю", 1);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
