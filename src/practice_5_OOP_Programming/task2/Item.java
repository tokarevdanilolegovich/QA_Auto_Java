package practice_5_OOP_Programming.task2;

public class Item implements Printable {
    private String name;
    private double price;
    private int count;

    public Item(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getCount(){
        return this.count;
    }

    public void setCount(int count){
        this.count = count;
    }
    @Override
    public void print(){
        System.out.println("Мой товар: имя " + this.name + ", цена " + this.price + ", количество " + this.count);
    };
}
