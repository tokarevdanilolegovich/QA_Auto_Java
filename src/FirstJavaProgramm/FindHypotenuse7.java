package FirstJavaProgramm;

public class FindHypotenuse7 {
    public static double findHypotenuse(double a, double b){
        double c = (a * a + b * b);
        return Math.sqrt(c);
    }
    public static void main(String[] args){
        System.out.println(findHypotenuse(3,4));
        System.out.println(findHypotenuse(6,8));
    }
}
