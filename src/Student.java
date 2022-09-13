public class Student extends Person{
    public String faculty;
    public double avgRate;
    public Student(String name, int age, String sex, String faculty, double avgRate){
        super(name, age, sex);
        this.faculty = faculty;
        this.avgRate = avgRate;
    }

    @Override
    public String toString() {
        return "- " +getClass().getName() + ": " + name + " " + age + " " + sex + " " + faculty + " " + avgRate;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

}
