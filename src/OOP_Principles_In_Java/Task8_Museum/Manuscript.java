package OOP_Principles_In_Java.Task8_Museum;

public class Manuscript extends Exhibit{
    public Manuscript(){
        super("Манускрипт");
    }

    @Override
    public void tellHistory(){
        System.out.println(getName() + " - это древний текст.");
    }

    @Override
    public void preserve(){
        System.out.println(getName() + " требует контролируемой влажности");
    }
}
