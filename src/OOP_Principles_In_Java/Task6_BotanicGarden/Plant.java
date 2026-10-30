package OOP_Principles_In_Java.Task6_BotanicGarden;

public abstract class Plant {
    private String species;
    public Plant(String species){
        this.species = species;
    }
    public String getSpecies(){
        return this.species;
    }

    public abstract void takeCare();
}
