import java.util.List;

public class PokemonTrainer {

    String name;

    List<Pokemon> pokemons;

    public PokemonTrainer() {

    }

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
