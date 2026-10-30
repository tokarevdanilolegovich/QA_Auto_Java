public class HelloWorld {
    //поля - переменные,принадлжеащие к классу
    static int a = 1;







    //методы

    //зеленая стрелочка - программа запускаемая
    //метод main - точка входа в программу
    public static void main(String[] args){
        System.out.println("Привет,мир!");
        System.out.println("Это Данил!");

        System.out.println(1 + 2);
        System.out.println(3 * 5);
        System.out.println("В поле а хранится: " + a);
        int sum1 = sum(1,2);
        System.out.println("Результат сложения: " + sum1);
        int mult1 = multiply(3,2);
        System.out.println("Результат умножения: " + mult1);

        int sub1 = substruct(10,3);
        System.out.println("Результат вычитания: " + sub1);

        double div1 = divide(3,2);
        System.out.println("Результат деления: " + div1);
    }

    public static int sum(int x,int y){
        //тело метода
        return x + y; //возвращаемое значение из метода
    }

    public static int multiply(int p,int k){
        //тело метода
        int mult = p * k;//создаём переменную, и присваиваем значение равное результату умножения p и k
        return mult;
    }

    public static int substruct(int g, int l){
        return g-l;
    }
    //возвращаемый тип данных - целое или нет?
    public static double divide(int s, int h){
        return (double) s / h; //закастовать к double - привести тип данных явно к double через (double)
    }
}
