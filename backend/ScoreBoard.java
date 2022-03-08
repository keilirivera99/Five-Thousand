public class ScoreBoard {
    private Score[] scores;
    private int scoreLeader;

    public ScoreBoard(Score[] scs){
        this.scores = scs;
        this.scoreLeader = -1;
    }

    public Score[] getScores(){
        return this.scores;
    }

    public int getScoreLeader(){
        return this.scoreLeader;
    }

    public void updateScLeader(int id){
        this.scoreLeader = id;
    }
}
