package OOP_Principles_In_Java.Task3_Restaurant;

public class Main {
    public static void main(String[] args){
        Administrator admin = new Administrator();
        HotMeal hotMeal = new HotMeal(50);
        Beverage beverage = new Beverage(250);
        admin.processGuests(hotMeal);
        admin.processGuests(beverage);

    }

}
