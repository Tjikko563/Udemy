public class Main {
    public static void main(String[] args) {

        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        FootballTeam levski = new FootballTeam("Levski", 16);
        FootballTeam beroe = new FootballTeam("Beroe", 11);
        FootballTeam cska = new FootballTeam("CSKA", 12);


        VolleyballTeam bulgaria = new VolleyballTeam("Bulgaria", 33);
        BasketballTeam reds = new BasketballTeam("Reds", 14);

        LeagueTable<FootballTeam> footballTeamLeagueTable = new LeagueTable<>("Football league");
        footballTeamLeagueTable.addTeam(levski);
        footballTeamLeagueTable.addTeam(cska);
        footballTeamLeagueTable.addTeam(beroe);
        footballTeamLeagueTable.printTable();
        footballTeamLeagueTable.compareTeams();
        footballTeamLeagueTable.printTable();


    }
}
