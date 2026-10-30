package OOP_Principles_In_Java.Task1_Zoo;

public class Bird extends Animal{
    public Bird(){
        super("Птица");
    }

    @Override
    public void makeSound(){
        System.out.println(getSpecie() + " чирикает");
    }

    @Override
    public void move(){
        System.out.println(getSpecie() + " летает");
    }
}