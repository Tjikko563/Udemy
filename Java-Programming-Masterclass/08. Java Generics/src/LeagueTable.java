import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        this.league.add(team);
    }

    public void compareTeams() {
        Collections.sort(league);
    }

    public void printTable() {
        Collections.reverse(league);
        System.out.println("League Table:");
        for (Team team: league) {
            System.out.printf("Team %s, score %d\n", team.getName(), team.getScore());
        }
    }
}
