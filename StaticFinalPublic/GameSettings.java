package StaticFinalPublic;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    static{
        maxPlayers = 20;
    }
    GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }
    void addPlayer(){
        currentPlayers++;
    }
    void printGameStatus(){
        System.out.println("Название игры: " + this.gameName + ", Текущее количество игроков: " + this.currentPlayers + ", Максимальное количество игроков: " + maxPlayers);
    }

    public static void main(String[] args){
        GameSettings game1 = new GameSettings("First Game", 10);
        GameSettings game2 = new GameSettings("Second Game", 6);
        game1.printGameStatus();
        game2.printGameStatus();
        GameSettings.setMaxPlayers(25);
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
