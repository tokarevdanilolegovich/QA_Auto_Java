package OOP_Principles_In_Java.Task6_BotanicGarden;

public class Cactus extends Plant{
    public Cactus(){
        super("Кактус");
    }

    @Override
    public void takeCare(){
        System.out.println(getSpecies() + ". Требования к уходу: много света, редкий полив");
    }
}
