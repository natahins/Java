import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args)  {

        ArrayList<Player> players = new ArrayList<Player>();
        Random r = new Random();
        int player_num;
        for (int i = 0; i < 16; i++) {
            player_num = r.nextInt(3);
            if (player_num == 0) {
                players.add(new Shooter("Player №" + String.valueOf(i+1)));
            }
            else if (player_num == 1) {
                players.add(new Healer("Player №" + String.valueOf(i+1)));
            }
            else if (player_num == 2) {
                players.add(new Engineer("Player №" + String.valueOf(i+1)));
            }
        }
        System.out.println("List of fighters: ");
        for (Player player : players) {
            System.out.println(player.getName() + "  -  " + player.getProffession() );
        }
        int fighterOne; //номер первого игрока
        int fighterTwo; //номер второго игрока
        System.out.println("FIGHT!!");
        while (true) {
            System.out.println(players.size() + " PLAYERS LEFT ");
            fighterOne = r.nextInt(players.size());
            while (true) {
                fighterTwo = r.nextInt(players.size());
                if (fighterOne != fighterTwo)
                    break;
            }
            Player fighter1 = players.get(fighterOne);
            Player fighter2 = players.get(fighterTwo);


            fighter1.fight(fighter2);
            fighter2.fight(fighter1);

            if (!fighter1.isAlive ) {
                System.out.println(fighter1.getName() + " has been killed");
                players.remove(fighter1);
            }

            if (!fighter2.isAlive ) {
                System.out.println(fighter2.getName() + " has been killed");
                players.remove(fighter2);
            }
            if(players.size() == 0 || players.size() == 1)
                break;
        }
        if (players.size() ==1) {
            System.out.println(players.get(0).getName() + " survived, "+ "Class is: " + players.get(0).getProffession());
        }
        else {
            System.out.println("Everybody died!!!!");
        }

    }
}
