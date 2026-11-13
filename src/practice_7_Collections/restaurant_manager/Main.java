package practice_7_Collections.restaurant_manager;

public class Main {
     public static void main(String[] args){
         RestaurantManager manager = new RestaurantManager();

         manager.addNewOrder("Картошка фри");
         manager.addNewOrder("Спагетти");
         manager.addNewOrder("Маргарита");

         manager.printOrders();
         manager.deleteOrder("Картошка фри");
         manager.addNewOrder("Спагетти");
         manager.printOrders();

         manager.getNextOrderForProcess();
         manager.printOrders();

     }
}
