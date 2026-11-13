package Collections_HomeWork.Tasks;

import java.util.*;

public class Task8_UniqueWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        HashSet<String> set = new HashSet<>();

        String[] words = text.split(" ");
        for(String word : words){
            set.add(word);
        }

        System.out.println("Уникальные слова: " + set);
        System.out.println("Уникальных слов: " + set.size());
    }
}
