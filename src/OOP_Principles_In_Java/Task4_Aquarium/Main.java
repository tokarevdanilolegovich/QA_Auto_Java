package OOP_Principles_In_Java.Task4_Aquarium;

public class Main {
    public static void main(String[] args){
        SeaCreature shark = new Shark();
        SeaCreature seaStar = new SeaStar();
        AquaController aquaController = new AquaController();
        aquaController.controlAqua(shark);
        aquaController.controlAqua(seaStar);
    }
}
