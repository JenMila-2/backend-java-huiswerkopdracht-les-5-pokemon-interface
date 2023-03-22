import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type = "grass";

    List<String> attacks = Arrays.asList("solarbeam", "leechseed", "leafblade", "leafstorm");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;

    }

    public void setType(String type) {

        this.type = type;
    }

    List<String> getAttacks() {

        return attacks;
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + getName() + " dont give in. Use Solar Beam!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Solar Beam on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "You got this " + getName() + ". It's time to use your Leech Seed!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " just hit " + enemy.getName() + " with a Leech Seed" + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(name.getName() + " gets 30 hp");
                name.setHp(name.getHp() + 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(name.getName() + " gets 10 hp");
                name.setHp(name.getHp() + 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(name.getName() + " gets 20 hp");
                name.setHp(name.getHp() + 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(name.getName() + " gets 40 hp");
                name.setHp(name.getHp() + 40);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void leafBlade(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Leaf Blade!!!" + " Do it now " + getName() + "!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Leaf Blade on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Come on " + getName() + "! Use Leaf Storm!" + "!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " is using Leaf Storm on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }
}