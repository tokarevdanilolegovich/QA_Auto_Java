package Collections_HomeWork.LinkedHashMap;

import java.util.*;

public class LinkedHashMap3 {
    public static void main(String[] args) {
        Map<String, String> history = new LinkedHashMap<>();

        addPageWithLimit(history, "page_1", "Главная страница");
        addPageWithLimit(history, "page_2", "Каталог товаров");
        addPageWithLimit(history, "page_3", "Корзина");
        addPageWithLimit(history, "page_4", "Оплата");
        addPageWithLimit(history, "page_5", "Личный кабинет");
        addPageWithLimit(history, "page_6", "Настройки");
        addPageWithLimit(history, "page_7", "Контакты");
        addPageWithLimit(history, "page_8", "О нас");
        addPageWithLimit(history, "page_9", "Блог");
        addPageWithLimit(history, "page_10", "Статья 1");

        addPageWithLimit(history, "page_11", "Статья 2");

        System.out.println("История просмотров:");
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue());
        }
    }

    public static void addPageWithLimit(Map<String, String> map, String id, String name) {
        if (map.size() >= 10) {
            String firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        map.put(id, name);
    }
}
