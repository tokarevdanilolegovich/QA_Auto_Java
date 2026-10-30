package OOP_Principles_In_Java.Task7_Attraction;

public class RollerCoaster extends Attraction{
    public RollerCoaster(){
        super("Американские горки");
    }

    @Override
    public void perceive(){
        System.out.println(getName() + " дают острые ощущения");
    }

    @Override
    public void maintain(){
        System.out.println(getName() + " требуют проверки безопасности");
    }
}
