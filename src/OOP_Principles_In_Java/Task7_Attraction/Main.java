package OOP_Principles_In_Java.Task7_Attraction;

public class Main {
    public static void main(String[] args){
        ParkAdministration admin = new ParkAdministration();
        Carousel carousel = new Carousel();
        RollerCoaster rollerCoaster = new RollerCoaster();

        admin.manage(carousel);
        admin.manage(rollerCoaster);
    }
}
