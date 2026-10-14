package FirstJavaProgramm;

public class MathOperations1 {

        public static int add(int x, int y){
            return x + y;
        }
        public static int substract(int x,int y){
            return x - y;
        }
        public static int multiply(int x,int y){
            return x * y;
        }
        public static double divide(int x, int y){
            return (double) x / y;
        }

    public static void main(String[] args){
            System.out.println(add(5,15));
            System.out.println(substract(5,15));
            System.out.println(multiply(5,15));
            System.out.println(divide(5,15));
        }

    }



