import java.util.Comparator;

public abstract class Person implements Comparable<Person>{
    public String name;
    public int age;
    public String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static Comparator<Person> PersonNameComparator = (person1, person2) -> {
        String personName1 = person1.name.toUpperCase();
        String personName2 = person2.name.toUpperCase();
        return personName1.compareTo(personName2);
    };

}
