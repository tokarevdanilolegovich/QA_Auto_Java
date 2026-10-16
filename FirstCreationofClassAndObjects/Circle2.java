package FirstCreationofClassAndObjects;

public class Circle2 {
    int radius;
    Circle2(int radius){
        this.radius = radius;
    }
    //GETTER:
    int getRadius(){
        return this.radius;
    }
    //SETTER:
    void setRadius(int radius){
        this.radius = radius;
    }
    //METHODS:
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public void printInfo(){
        System.out.println("Площадь круга: " + calculateArea() + ", Длина окружности: " + calculateCircumference());
    }
    public static void main(String[] args){
        Circle2 circle2 = new Circle2(33);
        circle2.printInfo();
        circle2.setRadius(100);
        circle2.printInfo();
    }
}
