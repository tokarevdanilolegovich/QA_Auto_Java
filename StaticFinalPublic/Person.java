package StaticFinalPublic;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;
    Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    //GETTERS:
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    String getSsn(){
        return this.ssn;
    }
    //SETTERS:
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }
    public static void main(String[] args){

        Person person1 = new Person("Danil","Tokarev","123");
        Person person2 = new Person("Ivan","Ivanov","321");
        Person person3 = new Person("Kiril","Kirilov","444");
        System.out.println("Оригинальные значения");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
        System.out.println("Новые значения");
        person2.setFirstName("Newname");
        person2.setLastName("NewLastname");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();

    }
}
