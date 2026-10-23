package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DefineDiscount_Task5 {
    public static void main(String[] args){
        defineDiscount();
    }
    public static void defineDiscount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age =  scanner.nextInt();
        int discount;
        if(age < 18){
            discount = 25;
        }
        else if(age >= 65){
            discount = 30;
        }
        else{
           discount = 0;
        }
        System.out.println("Размер скидки: " + discount + "%");
    }
}
