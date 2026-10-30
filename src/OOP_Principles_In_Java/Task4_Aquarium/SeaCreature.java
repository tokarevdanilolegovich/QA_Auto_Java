package OOP_Principles_In_Java.Task4_Aquarium;

public abstract class SeaCreature {
    private String seaKind;
    public SeaCreature(String seaKind){
        this.seaKind = seaKind;
    }
    public String getSeaKind(){
        return seaKind;
    }
    public abstract void move();
}
