package Exceptions_and_Generics.Exceptions.Task4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void checkStringOnCorrectEmail(String string){
        // Pattern — скомпилированный шаблон регулярки (компиляция дорогая, делается один раз).
        // \\w = буква/цифра/_ ; \\.[a-zA-Z]{2,} = точка + 2+ букв домена.
        // ВАЖНО: в Java-строке бэкслеш удваивается (\w недопустим — "illegal escape character")
        Pattern pattern = Pattern.compile("[\\w.]+@[\\w.-]+\\.[a-zA-Z]{2,}");
        // Matcher привязывает готовый шаблон к конкретной строке
        Matcher matcher = pattern.matcher(string);
        // matches() вернёт true, только если ВЕСЬ текст совпадает с шаблоном целиком
        if(!matcher.matches()){
            // unchecked-исключение: бросаем без throws в сигнатуре — компилятор не требует
            throw new ElectronicAdrdessException("Неккоректный адрес: " + string);
        }
        System.out.println(string + " - валидный e-mail.");
    }
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите email: ");
            String email = scanner.nextLine();
            checkStringOnCorrectEmail(email);
        }catch(ElectronicAdrdessException e){
            // try/catch здесь добровольный (исключение unchecked) — стоит только
            // чтобы красиво напечатать и не уронить программу; err — поток ошибок
            System.err.println(e.getMessage());
        }
    }
}
