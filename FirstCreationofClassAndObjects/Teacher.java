package FirstCreationofClassAndObjects;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    //GETTERS:
    String getName(){
        return this.name;
    }
    String getSubject(){
        return this.subject;
    }

    //SETTERS:
    void setName(String name){
        this.name = name;
    }
    void setSubject(String subject){
        this.subject = subject;
    }
    public void printInfo(){
        System.out.println("Имя учителя: " + this.name + ", Название предмета: " + this.subject);
    }
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Макаренко", "Педагогика");
        teacher1.printInfo();
        teacher1.setSubject("Астрономия");
        teacher1.printInfo();

    }
}
