package FirstCreationofClassAndObjects;

public class Circle {
    int radius;
    Circle(int radius){
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


    public double  calculateArea(){
        return Math.PI * radius*radius;
    }
    public  double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public void printCircleInfo(){
        System.out.println("Площадь круга: " + calculateArea() + ", Длина окружности: " +  calculateCircumference());
    }
    public static void main(){
        Circle circle1 = new Circle(10);
        circle1.printCircleInfo();
        circle1.setRadius(15);
        circle1.printCircleInfo();
    }
}
