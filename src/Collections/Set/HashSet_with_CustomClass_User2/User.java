package Collections.Set.HashSet_with_CustomClass_User2;

import java.util.Objects;

class User2 {
    private final String name;
    private final int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) { //Object o - это тот объект с которым мы будем сравнивать наш объект this
        //if (this == o) return true;
        if (!(o instanceof User2)) return false;//o - это тот объект который нам передели,с которым мы сравниваем, является ли он экземпляром класса User2
        User2 other = (User2) o; // создаем переменную other и прикастовываем o к типу данных User2 "насильно"
        return age == other.age && Objects.equals(name, other.name);//сравниваем == потому что примитивный тип данных int и equals потому что непримитивный тип данных String
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}