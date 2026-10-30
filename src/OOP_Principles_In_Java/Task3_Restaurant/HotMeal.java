package OOP_Principles_In_Java.Task3_Restaurant;

public class HotMeal extends Dish{
    private int temperature;
    public HotMeal(int temperature){
        super("Горячее блюдо");
        this.temperature = temperature;
    }

    @Override
    void printDescription(){
        System.out.println(getDishName() + ", Температура: " + temperature);
    }
}
