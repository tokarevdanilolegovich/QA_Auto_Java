package OOP_Principles_In_Java.Task6_BotanicGarden;

public class Main {
    public static void main(String[] args){
        Botanist botanist = new Botanist();
        Plant cactus = new Cactus();
        Plant orchid = new Orchid();
        botanist.work(cactus);
        botanist.work(orchid);
    }
}
