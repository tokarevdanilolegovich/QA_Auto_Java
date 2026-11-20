package Exceptions_and_Generics.Exceptions.Task4;

// extends RuntimeException (а НЕ Exception) — значит UNCHECKED:
// ловить не обязательно, throws в сигнатуре не нужен — всё на совести вызывающего
public class ElectronicAdrdessException extends RuntimeException {
    public ElectronicAdrdessException(String message) {
        super(message);
    }
}
