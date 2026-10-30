package FirstJavaProgramm;

public class CalculatePercentage9 {
    public static double calculatePercentage(double total,double part){
        return (part / total)*100;
    }
    public static void main(String[] args){
        System.out.println(calculatePercentage(3450, 167));
    }
}
