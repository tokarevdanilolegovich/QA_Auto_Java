package OOP_Principles_In_Java.Task3_Restaurant;

public abstract class Dish {
    private String dishName;
    public Dish(String dishName){
        this.dishName = dishName;
    }
    String getDishName(){
        return dishName;
    }
     abstract void printDescription();
}
