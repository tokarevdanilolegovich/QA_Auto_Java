package FirstCreationofClassAndObjects;

public class Rectangle2 {
    private int width;
    private int height;

    Rectangle2(int width,int height){
        this.width = width;
        this.height = height;
    }
    //GETTERS:
    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }

    //SETTER:
    void setWidth(int width){
        this.width = width;
    }
    public int calculateArea(){
        return this.width * this.height;
    }
    public void printSquare(){
        System.out.println("Square is " + calculateArea());

    }
    public static void main(String[] args){
        Rectangle2 rectangle2 = new Rectangle2(67,100);
        rectangle2.printSquare();
    }
}
