package StaticFinalPublic;

public class University {
    static String universityName;
    static{
        universityName = "UFSC";
    }
    final int studentID;
    String studentName;
    University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
    static void changeUniversityName(String newName){
        universityName = newName;
    }
    //getter:
    String getStudentName(){
        return this.studentName;
    }

    void printStudentInfo(){
        System.out.println("Имя студента: " + this.studentName + ", ID студента: " + this.studentID + ", Название университета: " + universityName);
    }
    public static void main(String[] args){
        University student1 = new University(153,"Petrov");
        University student2 = new University(154,"Kuznetsov");
        University student3 = new University(155,"Sidorov");
        System.out.println("Оригинальные значение");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        System.out.println("Меняем название университета");
        University.changeUniversityName("MIT");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
