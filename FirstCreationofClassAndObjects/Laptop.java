package FirstCreationofClassAndObjects;

public class Laptop {
    private String brand;
    private int price;
    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    //GETTERS:
    String getBrand(){
        return this.brand;
    }
    int getPrice(){
        return this.price;
    }

    //SETTERS:
    void setBrand(String brand){
        this.brand = brand;
    }
    void setPrice(int price){
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Бренд ноутбука: " + this.brand + ", Цена ноутбука: " + this.price);
    }

    public static void main(String[] args){
        Laptop laptop1 = new Laptop("ASUS", 1500);
        laptop1.printInfo();
        laptop1.setPrice(1800);
        laptop1.printInfo();
    }
}
