package OOP_Principles_In_Java.Task5_Farm;

public class Main {
    public static void main(String[] args){
        Farmer farmer = new Farmer();
        FarmAnimals cow = new Cow();
        FarmAnimals chicken = new Chicken();

        farmer.operateFarm(cow);
        farmer.operateFarm(chicken);
    }
}
