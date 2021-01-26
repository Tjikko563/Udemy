public abstract class Team implements Comparable<Team>{
    private String name;
    private int players;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
        this.players = 0;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Team team) {
        return this.score - team.getScore();
    }
}
