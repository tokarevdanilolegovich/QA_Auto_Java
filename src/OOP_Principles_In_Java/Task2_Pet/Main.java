package OOP_Principles_In_Java.Task2_Pet;

public class Main {
    public static void main(String[] args){
        Pet cat = new Cat();
        Pet dog = new Dog();
        Owner owner = new Owner();
        owner.havePet(cat);
        owner.havePet(dog);
    }
}
