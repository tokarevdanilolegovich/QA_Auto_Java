package OOP_Principles_In_Java.Task8_Museum;

public class Main {
    public static void main(String[] args){
        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.work(manuscript);
        museum.work(sculpture);

    }
}
