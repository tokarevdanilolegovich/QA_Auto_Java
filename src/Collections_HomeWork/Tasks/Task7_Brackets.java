package Collections_HomeWork.Tasks;

import java.util.*;

public class Task7_Brackets {
    public static void main(String[] args){
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность: ");
        String consequence = scanner.nextLine();
        scanner.close();

        for(char letter : consequence.toCharArray()){
            if(letter == '(' || letter == '{' || letter == '['){
                brackets.push(letter);
            }
            else if(letter == ')' || letter == '}' || letter == ']'){
                if(brackets.isEmpty()){
                    System.out.println("Скобочная последовательность некорректна");
                    return;
                }
                char open = brackets.pop();
                if((letter == ')' && open != '(') ||
                        (letter == '}' && open != '{') ||
                        (letter == ']' && open != '[')){
                    System.out.println("Скобочная последовательность некорректна");
                    return;
                }
            }
        }

        if(brackets.isEmpty()){
            System.out.println("Скобочная последовательность корректна");
        } else {
            System.out.println("Скобочная последовательность некорректна");
        }
    }
}