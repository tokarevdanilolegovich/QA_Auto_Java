package practice_2;

public class Main {
    public static void main(String[] args) {
        //проверка констурктора по умолчанию
        Student petya = new Student(18,"Петя");
        //System.out.println("Возраст Пети: " + petya.age);
        //System.out.println("Имя Пети: " + petya.name);
        petya.print();

        Student kolya = new Student(20,"Коля");

        System.out.println("Возраст Коли: " + kolya.age);
        System.out.println("Имя Коли: " + kolya.name);
        kolya.print();

        petya.setName("Антон");
        //ИЛИ - но мы используем Setter'ы , они предпочтительнее
        petya.name = "Anton";
        System.out.println("Новое имя Пети:" + petya.name);
        petya.print();

        kolya.setAge(21);
        //ИЛИ
        kolya.age = 21;
        System.out.println("Новый возраст Коли:" + kolya.age);
        kolya.print();


        //дебаг или дебаггинг
        //точка ОСТАНОВА

    }
}
