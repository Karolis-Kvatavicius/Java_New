package lesson9.collections.player;

import java.util.Comparator;

class Player implements Comparable<Player> {
    private final int score;
    private final String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Player anotherPlayer) {
        return anotherPlayer.getScore() - this.score;
    }

    // vidine klase kitos klases viduje
    static class PlayerComparator implements Comparator<Player> {

        @Override
        public int compare(Player p1, Player p2) {
            return p2.getScore() - p1.getScore();
        }

    }
}
