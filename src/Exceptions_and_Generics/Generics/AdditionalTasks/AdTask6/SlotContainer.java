package Exceptions_and_Generics.Generics.AdditionalTasks.AdTask6;

// класс-реализация дженерик-интерфейса: свой T передаётся НАСКВОЗЬ в Container<T>,
// поэтому один класс работает с любым типом (тип выбирается в main при создании)
public class SlotContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return this.item;
    }


}
