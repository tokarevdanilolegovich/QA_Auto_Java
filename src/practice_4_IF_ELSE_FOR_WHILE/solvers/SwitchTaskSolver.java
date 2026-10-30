package practice_4_IF_ELSE_FOR_WHILE.solvers;

import practice_4_IF_ELSE_FOR_WHILE.Season;

public class SwitchTaskSolver {
    public String dayOfWeek(int day){
        String dayOfWeek ="";
        switch(day){
            case(1):
                dayOfWeek = "Понедельник";
                break;
            case(2):
                dayOfWeek = "Вторник";
                break;
            case(3):
                dayOfWeek = "Среда";
                break;
            case(4):
                dayOfWeek = "Четверг";
                break;
            case(5):
                dayOfWeek = "Пятница";
                break;
            case(6):
                dayOfWeek = "Суббота";
                break;
            case(7):
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
                break;


            }
            return dayOfWeek;
        }
        public String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case SPRING -> description = "Всё цветет.";
            case AUTUMN -> description = "День рождения";
            }
            return description;
        }
    }

