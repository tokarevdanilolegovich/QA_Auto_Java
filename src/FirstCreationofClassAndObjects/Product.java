package FirstCreationofClassAndObjects;

public class Product {
    private String name;
    private double price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    //GETTERS:
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    //SETTER:
    void setPrice(int price){
        this.price = price;
    }

    //METHODS:
    public void applyDiscount(int discount){
        this.price = this.price - (this.price * discount) / 100  ;
    }
    public void printInfo(){
        System.out.println("Имя товара: " + this.name + ", Цена: " + this.price);
    }
    public static void main(String[] args){
        Product product1 = new Product("Колбаса",1500);
        product1.printInfo();
        product1.applyDiscount(1);
        product1.printInfo();
    }
}
