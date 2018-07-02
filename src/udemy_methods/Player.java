package udemy_methods;

public class Player {

//    private String name;
//    private  int ranking;
//
//    public Player(String name, int ranking) {
//        this.name = name;
//        this.ranking = ranking;
//    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (500 < score) {
            return 2;
        } else if (100 < score) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int ranking) {
        System.out.println();
        System.out.println(name + " managed to get into position " + ranking + " on the high score table.");
    }




}
