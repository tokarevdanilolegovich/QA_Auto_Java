package OOP_Principles_In_Java.Task3_Restaurant;

public class Beverage extends Dish{
    private int volume;
    public Beverage(int volume){
        super("Напиток");
        this.volume = volume;
    }

    @Override
    void printDescription(){
        System.out.println(getDishName() + ", Объём: " + this.volume);
    }
}
