package OOP_Principles_In_Java.Task8_Museum;

public class Sculpture extends Exhibit {
    public Sculpture(){
        super("Скульптура");
    }

    @Override
    public void tellHistory(){
        System.out.println(getName() + " - это древнегреческий герой");
    }

    @Override
    public void preserve(){
        System.out.println(getName() + " требует регулярной реставрации");
    }
}
