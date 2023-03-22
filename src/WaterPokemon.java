import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private String type = "water";

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
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

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Oke " + getName() + ", use Surf!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses Surf on " + enemy.getName() + Main.ANSI_RESET);
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
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + getName() + ", use Hydro Pump!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " just hit " + enemy.getName() + " with a Hydro Pump" + Main.ANSI_RESET);
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
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "You got this " + getName() + ". It's time to use your Hydro Canon!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses Hydro Canon on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Rain Dance " + getName() + ", lets go!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " is using Rain Dance on " + enemy.getName()  + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " gets a hp boost of 10!");
                enemy.setHp(enemy.getHp() + 10); //HP Boost
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                System.out.println("Attack Rain Dance has no effect on " + enemy.getName()); //No effect on Electric Pokemon
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

}
