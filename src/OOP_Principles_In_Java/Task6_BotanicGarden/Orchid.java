package OOP_Principles_In_Java.Task6_BotanicGarden;

public class Orchid extends Plant{
    public Orchid(){
        super("Орхидея");
    }

    @Override
    public void takeCare(){
        System.out.println(getSpecies() + ". Требования к уходу: высокая влажность и тень");
    }
}
