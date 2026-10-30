package IfElseSwitchForDoWhileBreakContinue;

public class BREAK2_SkippingNumber {
    public static void main(String[] args){
        skipNumbers();
    }
    public static void skipNumbers(){
        for(int i = 1; i<=20 ; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
