public class Score {
    private int value;
    private int playerId;
    private boolean block;

    public Score(){
        this.value = 0;
        this.block = true;
    }

    public int getValue(){
        return this.value;
    }

    public int getPlayer(){
        return this.playerId;
    }

    public void addToScore(int add){
        this.value += add;
    }

    public boolean isBlocked(){
        return this.block;
    }

    public void unblock(){
        this.block = false;
    }

    public boolean above5000(){
        return (this.value > 5000);
    }
}
