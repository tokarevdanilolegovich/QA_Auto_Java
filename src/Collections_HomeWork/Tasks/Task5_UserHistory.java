package Collections_HomeWork.Tasks;

import java.util.*;

public class Task5_UserHistory {
    public static void main(String[] arg){
        ArrayDeque<String> history = new ArrayDeque<>();
        for(int i = 1; i < 16 ; i++){
            history.push("HistoryRow" + i);
        }
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history.pop());
        System.out.println(history);
    }
}
