package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class SWITCH2_TicketCost {
    public static void main(String[] args){
        ticketCost();
    }
    public static void ticketCost(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : будние дни (1–5), выходные (6–7): ");
        int digitday = scanner.nextInt();
        String ticketcost;
        switch(digitday){
            case 1,2,3,4,5:
                ticketcost = "300 рублей";
                break;
            case 6,7:
                ticketcost = "450 рублей";
                break;
            default:
                ticketcost = "Невалидный ввод";
                break;


        }
        System.out.println("Cтоимость билета в кино: " + ticketcost);
    }
}
