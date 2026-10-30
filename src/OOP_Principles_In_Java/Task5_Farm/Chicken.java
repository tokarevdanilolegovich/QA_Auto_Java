package OOP_Principles_In_Java.Task5_Farm;

public class Chicken extends FarmAnimals{
    public Chicken(){
        super("Курица");
    }
    @Override
    public void giveProduct(){
        System.out.println(getKind() + " несёт яйца");
    }

    @Override
    public void requireCare(){
        System.out.println(getKind() + " требует зерно");
    }
}
