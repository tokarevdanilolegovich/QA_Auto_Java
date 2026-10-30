package practice_3_StaticFinalPublic;

public class Student {
    static int maxYears = 11;
    //OR
    static int maxYearsV2;
    final static int MAX_YEARS = 11;
    static int studentCount;
    static{

        maxYearsV2 = 12;
        studentCount = 0;
    }

    int age;
    String name;


    Student(int age, String name){
        this.age = age;
        this.name = name;
        studentCount++; // это увеличение на 1 - ИНКРЕМЕНТ
    }


    int getAge(){
        return this.age;
    }
    static int getYears(){
        return maxYears;
    }

    static void printMaxYears(){
        int a = 0;
        System.out.println(maxYears);
    }
}
