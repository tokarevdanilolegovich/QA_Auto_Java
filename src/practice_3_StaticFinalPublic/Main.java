package practice_3_StaticFinalPublic;

public class Main {
    public static void main(String[]args){
        // создали переменную petya
        // присвоили переменной экземпляр класса Student
        //вызвав дефолтный конструктор
        System.out.println(Student.studentCount);
        Student petya = new Student(18,"Petya");
        System.out.println(Student.studentCount);
        Student kolya = new Student(21,"Kolya");
        System.out.println(Student.studentCount);


        System.out.println(petya.age);
        System.out.println(kolya.age);

        System.out.println(Student.maxYears);
        Student.printMaxYears();
    }
}
