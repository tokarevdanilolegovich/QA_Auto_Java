package FirstJavaProgramm;

public class Difference3 {
    public static int difference(int x,int y){
        int dif1 = x - y;
        return Math.abs(dif1);
    }
    public static void main(String[] args){

        System.out.println(difference(300,1000));
    }
}
