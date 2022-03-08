public class DiceHand {
    private int[] hand;
    private int diceCount;
    private ScoreOpt[] options;

    public DiceHand(){
        this.hand = new int[] {0,0,0,0,0};
        this.diceCount = 5;
        this.options = new ScoreOpt[10];
    }

    public int[] getValues(){
        return this.hand;
    }

    public int getDiceCount(){
        return this.diceCount;
    }

    public ScoreOpt[] getOptions(){
        return this.options;
    }

    public void rollHand(){

    }

    public void calculateScores(){

    }

    public void changeDiceCount(int num){
        
    }
}
