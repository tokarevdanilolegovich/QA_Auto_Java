package OOP_Principles_In_Java.Task4_Aquarium;

public class SeaStar extends SeaCreature{
    final static String DEFAULT_SPEED = "медленно";
    private String speed;
    public SeaStar(){
        super("Морская звезда");
        this.speed = DEFAULT_SPEED;
    }

    @Override
    public void move(){
        System.out.println(getSeaKind() + " ползает " + this.speed );
    }
}
