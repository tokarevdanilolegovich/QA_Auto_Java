package OOP_Principles_In_Java.Task5_Farm;

public abstract class FarmAnimals implements Farmable {
    private String kind;
    public FarmAnimals(String kind){
        this.kind = kind;
    }
    public String getKind(){
        return this.kind;
    }

    @Override
    public abstract void giveProduct();
    @Override
    public abstract void requireCare();
}
