public class Methods {
    public static void main(String[] args) {

        displayHighScorePosition("Adam", 1000);
        displayHighScorePosition("John", 90);
        displayHighScorePosition("Eva", 600);
        displayHighScorePosition("Hugh", 50);

    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        int position = calculateHighScorePosition(highScore);
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int highScore) {
        if (highScore >= 1000) {
            return 1;
        } else if (highScore >= 500) {
            return 2;
        } else if (highScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
