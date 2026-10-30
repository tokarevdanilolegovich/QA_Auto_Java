package FirstJavaProgramm;

public class Square4 {
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return side * 4;
    }
    public static void main(String[] args){
        System.out.println(squareArea(15));
        System.out.println(squarePerimeter(15));
    }
}
