import java.util.Arrays;

public abstract class Team {

    private String name;
    private int maxNumberOfGames;
    private int currentNumberOfGames;
    protected Game[] teamGames;

    public Team(String name, int maxNumberOfGames) {
        this.name = name;
        this.maxNumberOfGames = maxNumberOfGames;
        this.currentNumberOfGames = 0;
        this.teamGames = new Game[maxNumberOfGames];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumberOfGames() {
        return maxNumberOfGames;
    }

    public void setMaxNumberOfGames(int maxNumberOfGames) {
        this.maxNumberOfGames = maxNumberOfGames;
    }

    public int getCurrentNumberOfGames() {
        return currentNumberOfGames;
    }

    public void setCurrentNumberOfGames(int currentNumberOfGames) {
        this.currentNumberOfGames = currentNumberOfGames;
    }

    public void addGame(Game x) {
        if (!x.getTeamGuest().getName().equalsIgnoreCase(name)&&!x.getTeamHome().getName().equalsIgnoreCase(name)) {
            System.out.println("den yparxei ayth h omada sto protatlhma");
            return;
        }
        if (currentNumberOfGames <maxNumberOfGames) {
            teamGames[currentNumberOfGames++] = x;
        }else {
            System.out.println("to plitos ton agonos den mporei na yperbainei to megisto plhtos agonon");
        }
    }

    public abstract int calcPoints();

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", maxNumberOfGames=" + maxNumberOfGames +
                ", currentNumberOfGames=" + currentNumberOfGames +
                ", teamGames=" + Arrays.toString(teamGames) +
                '}';
    }
}
