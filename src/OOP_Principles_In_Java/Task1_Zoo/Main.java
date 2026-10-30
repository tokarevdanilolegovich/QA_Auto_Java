package OOP_Principles_In_Java.Task1_Zoo;

public class Main {
    public static void main(String[] args){
        Animal bird = new Bird();
        Animal elephant = new Elephant();
        Zoo zoo = new Zoo();
        zoo.operate(bird);
        zoo.operate(elephant);
    }
}