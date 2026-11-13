package practice_7_Collections.photo_editor;

import java.util.ArrayDeque;
import java.util.Stack;

public class PhotoEditor {
    //хранить последние действия

    private Stack<String> actions;

    public PhotoEditor(){
        this.actions = new Stack();
    }

    //добавить новое действие
    public void addNewAction(String action){
        actions.push(action);
    }

    //иметь возможность откатить последнее действие
    public void undoLastAction(){
        actions.pop();
    }

    //печать
    public void printAction(){
        System.out.println("Все действия: ");
        actions.forEach( System.out::println);
        System.out.println();
    }
}
