package IfElseSwitchForDoWhileBreakContinue;

public class DOWHILE3_PrintNumberFrom1To10 {
    public static void main(String[] args){
        printNumbers();
    }
    public static void printNumbers(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
