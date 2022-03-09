public class Player {
    private String name;
    private int id;
    private Score score;
    private TempScore tScore;

    public Player(String name, int id){
        this.name = name;
        this.id = id;
        this.score = new Score();
        this.tScore = new TempScore();
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public Score getScore(){
        return this.score;
    }

    public TempScore getTempScore(){
        return this.tScore;
    }
}
