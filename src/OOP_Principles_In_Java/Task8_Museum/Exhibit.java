package OOP_Principles_In_Java.Task8_Museum;

public abstract class Exhibit {
    private String name;
    public Exhibit(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void tellHistory();
    public abstract void preserve();
}
