import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final String name1 = "Josh";
        final String name2 = "John";
        final String name3 = "Jhon";
        final String name4 = "James";
        final String name5 = "Joe";
        final int score1 = random.nextInt(1500);
        final int score2 = random.nextInt(1500);
        final int score3 = random.nextInt(1500);
        final int score4 = random.nextInt(1500);
        final int score5 = random.nextInt(1500);
        displayHighScorePosition(name1, calculatePosition(score1), score1);
        displayHighScorePosition(name2, calculatePosition(score2), score2);
        displayHighScorePosition(name3, calculatePosition(score3), score3);
        displayHighScorePosition(name4, calculatePosition(score4), score4);
        displayHighScorePosition(name5, calculatePosition(score5), score5);
    }

    public static void displayHighScorePosition(String name, int position, int score) {
        System.out.printf("%s got position %d with score:%d%n", name, position, score);
    }

    public static int calculatePosition(int score) {
        if ( score >= 1000 ) {
            return 1;
        } else if ( score >= 500 ) {
            return 2;
        } else if ( score >= 100 ) {
            return 3;
        } else {
            return 4;
        }
    }
}