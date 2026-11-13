package practice_7_Collections.LinkedHashSet_HashMap_TreeMap.Arrays_asList;

import java.util.*;

public class Test {
    public static void main(String[] args){
        List<String> list = Arrays.asList("A","B","C");
        list.set(1,"X");
        list.add("D"); // мы не можем расширять массив,Arrays.asList - это не динамический массив, то есть создали с 3мя элементами,значит его размер 3,он не может стать массивом с 4мя элементами
        System.out.println(list);
    }
}
/*
Arrays.asList("A", "B", "C") — это статический метод утилитарного класса java.util.Arrays,
 который позволяет быстро создать список (List) из переданных элементов в одну строчку,
 не вызывая .add() для каждого элемента вручную.
 Что происходит внутриМетод принимает аргументы переменной длины (varargs: T... a),
  которые компилятор Java автоматически упаковывает в обычный массив new String[]{"A", "B", "C"}.
  На основе этого массива метод возвращает объект-обертку с интерфейсом List.
  Главный подвох (java.util.Arrays$ArrayList ≠ java.util.ArrayList)
  Этот метод возвращает не привычный динамический java.util.ArrayList,
  а специальный приватный статический класс, спрятанный внутри самого класса Arrays
  (его тоже назвали ArrayList, из-за чего часто возникает путаница).
  Этот список напрямую ссылается на исходный массив и имеет фиксированный размер:
  Изменять элементы можно: вызов list.set(0, "Z") сработает и заменит "A" на "Z".
  Менять размер нельзя: вызовы list.add("D") или list.remove(0) выбросят исключение UnsupportedOperationException,
  так как обычный массив под капотом не умеет растягиваться или сжиматься.
  Связь с массивом: если передать в Arrays.asList(myArray) существующий массив,
  изменение элемента в списке изменит его и в самом массиве myArray (и наоборот).
  Сравнение способов быстрого создания списка в JavaСпособИзменение элементов (set)
  Добавление и удаление (add/remove)Поддержка nullArrays.asList("A", "B")
  ДаНет (UnsupportedOperationException)ДаList.of("A", "B") (Java 9+)
  Нет (UnsupportedOperationException)Нет (UnsupportedOperationException)
  Нет (NullPointerException)new ArrayList<>(Arrays.asList("A", "B"))Д
  аДаДаЕсли в коде нужен полноценный изменяемый список, который можно инициализировать в одну строку и потом дополнять новыми элементами, результат Arrays.asList передают в конструктор стандартного ArrayList:JavaList<String> mutableList = new ArrayList<>(Arrays.asList("A", "B", "C"));
mutableList.add("D"); // Работает без ошибок
 */
