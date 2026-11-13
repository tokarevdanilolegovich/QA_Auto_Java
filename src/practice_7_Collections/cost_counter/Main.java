package practice_7_Collections.cost_counter;

public class Main {
    public static void main(String[] args){
        CostCounter costCounter = new CostCounter();

        costCounter.addCosts(1, 123.12);
        costCounter.addCosts(2,1233.2);
        costCounter.addCosts(3,500.2);
        costCounter.addCosts(4,523532.2);
        costCounter.addCosts(5,5235.2);
        costCounter.addCosts(6,7457.2);
        costCounter.addCosts(7,64563.2);
        costCounter.addCosts(8,19824.2);
        costCounter.addCosts(9,333.2);
        costCounter.addCosts(10,554345.2);
        costCounter.addCosts(11,37432784.2);
        costCounter.addCosts(12,837.2);


        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.getMinCostMonth());
    }
}
