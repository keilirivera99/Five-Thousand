public class Player {
    private String name;
    private int id;
    private int scoreVal;
    private TempScore tScore;
    //official score?

    public Player(String name, int id){
        this.name = name;
        this.id = id;
        this.scoreVal = 0;
        this.tScore = new TempScore();
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int getScoreVal(){
        return this.scoreVal;
    }

    public TempScore getTempScore(){
        return this.tScore;
    }
}
