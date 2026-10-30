package OOP_Principles_In_Java.Task7_Attraction;

public class Carousel extends Attraction{
    public Carousel(){
        super("Карусель");
    }

    @Override
    public void perceive(){
        System.out.println(getName() + " это спокойный аттракцион");
    }

    @Override
    public void maintain(){
        System.out.println(getName() + " требует тех.обслуживания");
    }

}
