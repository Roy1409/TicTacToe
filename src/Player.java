public class Player {
    private int winningStreak;
    private String name = "";

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        name="Unknown";
    }

    public String getName() {
        return name;
    }

    public void win() {
        winningStreak++;
    }

    public void resetStreak() {
        winningStreak = 0;
    }


    public int getWinningStreak() {
        return winningStreak;
    }


}



