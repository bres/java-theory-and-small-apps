public class Game {

    private int scoreHome;
    private int scoreGuest;
    private Team teamHome;
    private Team teamGuest;

    public Game(int scoreHome, int scoreGuest, Team teamHome, Team teamGuest) {
        this.scoreHome = scoreHome;
        this.scoreGuest = scoreGuest;
        this.teamHome = teamHome;
        this.teamGuest = teamGuest;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreGuest() {
        return scoreGuest;
    }

    public void setScoreGuest(int scoreGuest) {
        this.scoreGuest = scoreGuest;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Team getTeamGuest() {
        return teamGuest;
    }

    public void setTeamGuest(Team teamGuest) {
        this.teamGuest = teamGuest;
    }
    
}
