package OOP_Principles_In_Java.Task1_Zoo;

public abstract class Animal {
    private String specie;
    public Animal(String specie){
        this.specie = specie;
    }
    public String getSpecie(){
        return this.specie;
    }
    public abstract void makeSound();
    public abstract void move();
}