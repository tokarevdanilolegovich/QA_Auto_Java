package practice_4_IF_ELSE_FOR_WHILE;

import practice_4_IF_ELSE_FOR_WHILE.solvers.IfElseTaskSolver;
import practice_4_IF_ELSE_FOR_WHILE.solvers.SwitchTaskSolver;

public class Main {
    public static void main(String[] args){
        IfElseTaskSolver ifElseTaskSolver = new IfElseTaskSolver();



        //проверка метода возвращающего день недели по числу
        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();
        System.out.println(switchTaskSolver.dayOfWeek(5));
        System.out.println(switchTaskSolver.dayOfWeek(15));

        //проверка метода по описанию сезона
        System.out.println(switchTaskSolver.describeSeason(Season.WINTER));
        System.out.println(switchTaskSolver.describeSeason(Season.AUTUMN));



    }
}
