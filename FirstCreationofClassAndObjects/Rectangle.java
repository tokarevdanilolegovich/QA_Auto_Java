package FirstCreationofClassAndObjects;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    //getters:
    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }

    //setters:
    void setWidth(int width){
        this.width = width;
    }
//    Для высоты был не нужен
//    void setHeight(int height){
//        this.height = height;
//    }

    public int calculateArea(){
        return this.width * this.height;
    }
    public void print(){
        System.out.println("Square is " + calculateArea());
    }

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(10,15);
        rectangle1.print();
        rectangle1.setWidth(33);
        rectangle1.print();
    }
}
