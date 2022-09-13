
public class Teacher extends Person {
    public String position;
    public int experience;
    public Teacher(String name, int age, String sex, String position, int experience){
        super(name, age, sex);
        this.position = position;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "* " +getClass().getName() + ": " + name + " " + age + " " + sex + " " + position + " " + experience;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
