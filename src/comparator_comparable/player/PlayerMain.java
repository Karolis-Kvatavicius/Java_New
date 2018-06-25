package comparator_comparable.player;

import nestedclasses.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class PlayerMain {
    public static void main(String[] args) {
        Player p1 = new Player(18454, "Simas");
        Player p2 = new Player(59787, "Jonas");
        Player p3 = new Player(32891, "Darius");

        // ArrayList issaugo eiliskuma
        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        // pradines reiksmes
        System.out.println(players);

        // rusiavimui naudoja compareTo is Player klases
        Collections.sort(players);
        System.out.println(players);

        // rusiavimui naudoja compare is PlayerComparator klases
        Collections.sort(players, new Player.PlayerComparator());
        System.out.println(players);

        // rusiavimui naudoja anonimine klase
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return p2.getScore() - p1.getScore();
            }
        });
        System.out.println(players);

        System.out.println();
        // TreeSet visada surusiuoja
        Set<Player> team = new TreeSet<>();
        team.add(p1);
        team.add(p2);
        team.add(p3);
        System.out.println(team);

        System.out.println("Simas: " + findRanking(p1, team));
        System.out.println("Jonas: " + findRanking(p2, team));
        System.out.println("Darius: " + findRanking(p3, team));
    }

    private static int findRanking(Player player, Set<Player> team) {
        List<Player> players = new ArrayList<>(team);
        return players.indexOf(player) + 1;
    }
}
