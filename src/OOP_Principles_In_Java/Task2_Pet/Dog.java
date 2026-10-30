package OOP_Principles_In_Java.Task2_Pet;

public class Dog extends Pet{
    public Dog(){
        super("Собака");
    }

    @Override
    public void beActive(){
        System.out.println(getTypeOfPet() + " гуляет");
    }

    @Override
    public void feed(){
        System.out.println(getTypeOfPet() + " ест сухой корм");
    }
}
