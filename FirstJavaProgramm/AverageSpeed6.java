package FirstJavaProgramm;

public class AverageSpeed6 {
    public static double averageSpeed(double distance,double time){
        return (double) distance / time;
    }
    public static void main(String[] args){
        System.out.println(averageSpeed(1500,66));
        System.out.println(averageSpeed(3500,88));
    }
}
