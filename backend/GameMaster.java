import java.util.Scanner;

public class GameMaster{
    private Player[] players;
    private int scoreLeader;

    public GameMaster(){
        this.players = createPlayers();
        this.scoreLeader = -1;
    }

    public Player[] getPlayers(){
        return this.players;
    }

    public int getScoreLeader(){
        return this.scoreLeader;
    }

    public void updateLeader(String p){

    }

    /*identify number of players from user,
    * get user names,
    * creates Players.
    * RETURNS: array of Players
    */
    public Player[] createPlayers(){
        Scanner scan = new Scanner(System.in);
        int numPlayers = 1000;
        while(numPlayers > 5){
            System.out.println("Enter number of players, 5 max players");
            numPlayers = scan.nextInt();
        }
        scan.nextLine();
        Player[] p = new Player[numPlayers];

        for(int i = 0; i < p.length; i++){
            System.out.println("Enter name for Player " + (i+1));
            p[i] = new Player(scan.nextLine(), (i+1));
        }
        scan.close();
        return p;
    }


    public void playerTurn(){

    }

    public boolean willRollAgain(){
        return false;
    }

    public void endTurn(){

    }

    public void playAgain(){

    }

    public void finalTurns(){

    }

    public void endGame(){

    }
}