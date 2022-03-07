public class GameMaster{
    private Player[] players;
    private ScoreBoard scoreBoard;

    public GameMaster(){
        this.players = requestPlayers();
        this.scoreBoard = new ScoreBoard(players);
    }

    public requestPlayers(){

    }
}