package FirstCreationofClassAndObjects;

public class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y =y;
    }
    //GETTERS:
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    //SETTER for x
    void setX(int x){
        this.x = x;
    }
    public void print(){
        System.out.println("Координаты Х: " + this.x + ", Координаты Y: " + this.y);
    }
    public static void main(String[] args){
        Point point = new Point(10,15);
        point.print();
        point.setX(25);
        point.print();
    }
}
