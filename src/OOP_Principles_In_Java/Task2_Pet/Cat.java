package OOP_Principles_In_Java.Task2_Pet;

public class Cat extends Pet {
    public Cat(){
        super("Кошка");
    }

    @Override
    public void beActive(){
        System.out.println(getTypeOfPet() + " играет");
    }

    @Override
    public void feed(){
        System.out.println(getTypeOfPet() + " ест влажный корм");
    }
}
