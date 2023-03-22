import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private String type = "fire";

    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
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

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + name.getName() + " use Fire Lash!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Fire Lash on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {

        System.out.println(Main.ANSI_YELLOW + "Use your Flame Thrower " + getName() + "!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " hits " + enemy.getName() + " with a Flame Thrower" + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
        }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "It's time for your Pyro Ball " + getName() +"!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Pyro Ball on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 32 hp");
                enemy.setHp(enemy.getHp() - 32);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 24);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "You got this " + getName() + ". Use Inferno!!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " hits " + enemy.getName() + " with Inferno" + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }
}
