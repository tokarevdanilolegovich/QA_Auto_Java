package OOP_Principles_In_Java.Task5_Farm;

public class Cow extends FarmAnimals{
    public Cow(){
        super("Корова");
    }
    @Override
    public void giveProduct(){
        System.out.println(getKind() + " даёт молоко");
    }

    @Override
    public void requireCare(){
        System.out.println(getKind() + " нуждается в выпасе");
    }
}
