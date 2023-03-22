import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private String type = "electric";

    List<String> attacks = Arrays.asList("volttackle", "thunder", "electroball", "thunderpunch");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
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

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Volt Tackle!!!" + " Do it now " + getName()+ "!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Volt Tackle on " + enemy.getName() + Main.ANSI_RESET) ;
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + "Come on " + getName() + ", you can do it! Use Thunder!" + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses Thunder on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " gets a hp boost of 15!");
                enemy.setHp(enemy.getHp() + 15);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

   public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + getName() + " use your Electro Ball!" + Main.ANSI_RESET);
       System.out.println(Main.ANSI_YELLOW + name.getName() + " is using Electro Ball on " + enemy.getName() + Main.ANSI_RESET);
       switch (enemy.getType()) {
           case "fire" -> {
               System.out.println(enemy.getName() + " loses 16 hp");
               enemy.setHp(enemy.getHp() - 16);
           }
           case "grass" -> {
               System.out.println(enemy.getName() + " loses 24 hp");
               enemy.setHp(enemy.getHp() - 24);
           }
           case "water" -> {
               System.out.println(enemy.getName() + " loses 32 hp");
               enemy.setHp(enemy.getHp() - 32);
           }
           case "electric" -> {
               System.out.println(enemy.getName() + " loses 8 hp");
               enemy.setHp(enemy.getHp() - 8);
           }
       }
       System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(Main.ANSI_YELLOW + getName() + ", lets try your Thunder Punch." + Main.ANSI_RESET);
        System.out.println(Main.ANSI_YELLOW + name.getName() + " uses a Thunder Punch on " + enemy.getName() + Main.ANSI_RESET);
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
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
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println("Remaining hp for " + enemy.getName() + " is: " + enemy.getHp());
    }

}
