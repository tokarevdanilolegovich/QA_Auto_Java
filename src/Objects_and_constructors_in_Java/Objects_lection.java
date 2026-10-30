package Objects_and_constructors_in_Java;

public class Objects_lection {
    public static class Student{
        int age;
        String name;

        Student(int someAge, String someName){
            //тело метода-конструктора
            this.age = someAge;
            this.name = someName;
        }
        Student petya = new Student(18,"Petya");

        int getAge(){
            return this.age;
        }
        String getName(){
            return this.name;
        }

        //int age = petya.getAge();

        void setAge(int newAge){ //Сеттер для поля Age
            this.age = newAge;
        }

        void setName(String newName){//Сеттер для поля Name
            this.name = newName;
        }

        //petya.setAge(19);




    }
}
