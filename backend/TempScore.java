public class TempScore {
    private int value;

    public TempScore(){
        this.value = 0;
    }

    public int getValue(){
        return this.value;
    }

    public void addToScore(int add){
        this.value += add;
    }

    public boolean above500(){
        return (this.value > 500);
    }

    public void resetToZero(){
        this.value = 0;
    }
}
