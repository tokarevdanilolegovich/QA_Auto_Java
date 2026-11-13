package Collections_HomeWork.Tasks;

import java.util.*;

public class Task4_PagesVisited {
    public static void main(String[] args){
        HashSet<String> pages = new HashSet<>();
        int totalCount = 0;
        Scanner scanner = new Scanner(System.in);
        String url = "";
        do{
            System.out.println("Введите url: ");
            url = scanner.nextLine();
            if(url.equals("STOP")) break;
            pages.add(url);
            totalCount++;
        }while(true);
        System.out.println(pages.size());
        System.out.println(pages);
        System.out.println(totalCount);

    }
}
