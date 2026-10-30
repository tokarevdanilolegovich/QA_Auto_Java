package practice_5_OOP_Programming.task1;

public class Main {
    public static void main(String[] args){
        Transport car = new Car(); //SOLID - L - Барбара Лисков - принцип подстановки - заменяем тип данных наследника на родителя.ЧТобы он сработал,нужно чтобы структура создания объектов всегда была одинаковой: Если родительский класс имеет конструктор для создания обьъектов,значит и наследник должен иметь точно такой же конструктор.ЧТобы сущности создавались по одному и тому же алгоритму
        Transport ship = new Ship();
        Transport plane = new Plane();

        Dispatcher dispatcher  = new Dispatcher();
        dispatcher.control(car);
        dispatcher.printTransportDetails(car);

        dispatcher.control(ship);
        dispatcher.printTransportDetails(ship);

        dispatcher.control(plane);
        dispatcher.printTransportDetails(plane);

    }
}
