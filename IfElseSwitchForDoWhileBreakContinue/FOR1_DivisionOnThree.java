package IfElseSwitchForDoWhileBreakContinue;

public class FOR1_DivisionOnThree {
    public static void main(String[] args){
        divisionOnThree();
    }
    public static void divisionOnThree(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
