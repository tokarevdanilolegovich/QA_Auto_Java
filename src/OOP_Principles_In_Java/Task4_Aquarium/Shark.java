package OOP_Principles_In_Java.Task4_Aquarium;

public class Shark extends SeaCreature{
    final static String DEFAULT_VELOCITY = "быстро";
    final static String DEFAULT_BEHAVIOR = "агрессивно";
    private String velocity;
    private String behavior;

    public Shark(){
        super("Акула");
        this.velocity = DEFAULT_VELOCITY;
        this.behavior = DEFAULT_BEHAVIOR;
    }

    @Override
    public void move(){
        System.out.println(getSeaKind() + " плавает " + this.velocity + " и " + this.behavior);
    }
}


