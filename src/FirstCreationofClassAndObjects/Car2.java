package FirstCreationofClassAndObjects;

public class Car2 {
    private String brand;
    private int year;

    Car2(String brand,int year){
        this.brand = brand;
        this.year = year;
    }

    //getters:
    String getBrand(){
        return this.brand;

    }

    int getYear(){
        return this.year;
    }

    //setters:
    void setBrand(String brand){
        this.brand = brand;
    }
    void setYear(int year){
        this.year = year;
    }
    public void print(){
        System.out.println("Марка: " + this.brand + ", Год: " + this.year);
    }
    public static void main(String[] args){
        Car2 car2 = new Car2("Citroen",1995);
        car2.print();
        car2.setBrand("Audi");
        car2.print();
    }
}
