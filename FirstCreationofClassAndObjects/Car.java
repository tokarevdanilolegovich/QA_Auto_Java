package FirstCreationofClassAndObjects;

public class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    //ГЕТТЕРЫ:
    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }


    //CЕТТЕРЫ:
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Марка: " + this.brand + ", Год выпуска: " + this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2010);
        car1.print();
        car1.setYear(2015);
        car1.print();
    }


}
