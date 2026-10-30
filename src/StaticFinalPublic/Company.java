package StaticFinalPublic;

public class Company {
    static String companyName;
    static{
        companyName = "Apple";
    }
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    static void printCompanyName(){
        System.out.println("CompanyName: " + Company.companyName);
    }
    //GETTER
    String getEmployeeName(){
        return this.employeeName;
    }
    //SETTER
    void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public static void main(String[] args){
        //создаём 3 обьекта класса:
        Company emp1 = new Company(1,"Tokarev");
        Company emp2 = new Company(2,"Semibratov");
        Company emp3 = new Company(3,"Halilov");
        //вывод CompanyName для всех 3 экземпляров класса - ОКАЗЫВВАЕТСЯ можно вызывать статический метод не только у класса,но и у конкртеного экземпляра
        emp1.printCompanyName();
        emp2.printCompanyName();
        emp3.printCompanyName();

        //задаём новое значение для static-поля companyName
        Company.companyName = "MSFT";
        //вывод CompanyName для всех 3 экземпляров класса с новым значением
        System.out.println("После изменения:");
        emp1.printCompanyName();
        emp2.printCompanyName();
        emp3.printCompanyName();
        //ошибка компиляции
        //emp1.employeeID = 5; //Cannot assign a value to final variable 'employeeID'


    }
}
