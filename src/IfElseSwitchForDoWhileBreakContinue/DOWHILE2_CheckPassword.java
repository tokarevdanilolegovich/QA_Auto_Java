package IfElseSwitchForDoWhileBreakContinue;

import java.util.Scanner;

public class DOWHILE2_CheckPassword {
    public static void main(String[] args){
        checkPassword();
    }
    public static void checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String correctpassword = "123456";
        String password;
        do{
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

        }while(!password.equals(correctpassword));
        System.out.println("Вы ввели корректный пароль!");
    }
}
