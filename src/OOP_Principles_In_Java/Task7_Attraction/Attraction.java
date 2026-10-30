package OOP_Principles_In_Java.Task7_Attraction;

public abstract class Attraction {
    private String name;
    public Attraction(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void perceive();

    public abstract void maintain();
}
