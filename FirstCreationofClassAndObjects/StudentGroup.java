package FirstCreationofClassAndObjects;

public class StudentGroup {
    private String groupName;
    private int studentCount;
    StudentGroup(String groupName,int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    //GETTERS:
    String getGroupName(){
        return this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }

    //SETTERS:
    void setGroupName(String groupName){
        this.groupName = groupName;
    }
    void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    public void printInfo(){
        System.out.println("Имя группы: " + this.groupName + ", Количество студентов: " + this.studentCount);
    }
    public static void main(String[] args){
        StudentGroup studentGroup = new StudentGroup("Отличники", 35);
        studentGroup.printInfo();
        studentGroup.setStudentCount(44);
        studentGroup.printInfo();
    }
}