package OOP_Principles_In_Java.Task2_Pet;

public abstract class Pet {
    private String typeOfPet;

    public Pet(String typeofpet){
        this.typeOfPet = typeofpet;
    }
    public String getTypeOfPet(){
        return this.typeOfPet;
    }



    public abstract void beActive();
    public abstract void feed();
}
