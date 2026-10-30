package practice_4_IF_ELSE_FOR_WHILE.solvers;

public class ForTaskSolver {

    public static void main(String[] args){
        //проверка таблицы умножения числа
        multiplyTable(5);
        //проверка суммы всех чисел до числа
        System.out.println(sumOfAllNumbers(10));
        //проверка работы метода по определению простого числа
        System.out.println(checkNumberIsSimple(7));
        System.out.println(checkNumberIsSimple(6));
        //проверка метода по распечатке всех простых чисел до 100
        printAllSimpleNumbersBefore100();
    }



    public static void multiplyTable(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(
                    number + " x " + i +" = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n){
        int sum = 0;

        //ШАГ 1: sum = 0, i = 1 -> sum = 1;
        //ШАГ 2: sum = 1, i = 2 -> sum = 3;
        //ШАГ 3: sum = 3, i = 3 -> sum = 6;
        //ШАГ 4: sum = 6, i = 4 -> sum = 10;
        //ШАГ 5: sum = 10, i = 5 -> sum = 15;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static boolean checkNumberIsSimple(int number){
        //простое число,число которое делится ТОЛЬКО на само себя и на 1
        //пример 7
        //2,3,4,5,6  -> число простое
        //пример 6
        // 2 -> не простое

        boolean isSimple = true;
        for (int i =2; i<= number-1; i++){
            if(number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100(){
        for (int i = 2; i <=100; i++){
            if (checkNumberIsSimple(i)){ // checkNumberIsSimple(i) == true это просто checkNumberIsSimple(i), а checkNumberIsSimple(i) == false Это просто !checkNumberIsSimple(i)
                System.out.println(i);
            }
        }
    }
}
