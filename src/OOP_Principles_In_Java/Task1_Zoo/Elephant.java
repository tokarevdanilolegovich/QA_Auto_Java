package OOP_Principles_In_Java.Task1_Zoo;

public class Elephant extends Animal{
    public Elephant(){
        super("Слон");
    }
    @Override
    public void makeSound(){
        System.out.println(getSpecie() + " трубит");
    }

    @Override
    public void move(){
        System.out.println(getSpecie() + " ходит");
    }
}