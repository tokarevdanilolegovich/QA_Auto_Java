package practice_7_Collections.restaurant_manager;
import java.util.*;
public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager(){
        this.orders = new LinkedList<>();
    }
    //добавлять заказ в конец очереди
    public void addNewOrder(String order){
        orders.addLast(order);
    }
    //обрабатывать заказ из начала очереди
    public String getNextOrderForProcess(){
        return orders.poll();
    }
    //удалять заказ в любом месте очереди -> поэтому нужно использовать СПИСОК!
    public void deleteOrder(String order){
        orders.remove(order);
    }

    //метод для отладки
    public void printOrders(){
        System.out.println("Все заказы: ");
        orders.forEach( order -> System.out.println(order));
        System.out.println();
    }
}
