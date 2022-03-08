public class ScoreOpt {
    private int value;
    private int[] dice;

    public ScoreOpt(int val, int[] dice){
        this.value = val;
        this.dice = dice;
    }

    public int getValue(){
        return this.value;
    }

    public int[] getDice(){
        return this.dice;
    }
}
