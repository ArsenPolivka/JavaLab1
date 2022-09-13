import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter m: ");
//        int m = input.nextInt();
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//
//        Matrix matrix1 = new Matrix(m,n);
//        System.out.println("Start Matrix");
//        System.out.println(matrix1);
//
//        matrix1.SortMatrixByColumns();
//
//        Matrix matrix2;
//        matrix2 = matrix1;
//
//        var vector = matrix2.MatchWithFibonacci();
//
//        System.out.println("Vector: ");
//        if (vector.size() == 0){
//            System.out.println("Vector is empty!");
//        }
//        for (int item: vector) {
//            System.out.print(item + "\t");
//        }

        //Task 2
//    StringTask task = new StringTask();
//    task.Task();

        //Task 3
        Person[] people = {
                new Student("Arsen", 18, "Male", "Math", 70.66),
                new Student("Nazar", 19, "Male", "Math", 66),
                new Student("Ostap", 23, "Male", "Law", 89),
                new Student("Nastia", 20, "Female", "Math", 52),
                new Student("Sasha", 18, "Female", "Law", 92),
                new Teacher("Sergii", 45, "Male", "Lector", 6),
                new Teacher("Bogdan", 63, "Male", "Lector", 15),
                new Teacher("Lesia", 39, "Female", "Assistant", 10),
                new Teacher("Sviatoslav", 58, "Male", "Lector", 13),
                new Teacher("Oleksii", 35, "Male", "Assistant", 4),
        };
        for (var person: people) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("\nSorted by name: \n");
        Arrays.sort(people, Person.PersonNameComparator);
        for (var person: people) {
            System.out.println(person);
        }
        System.out.println("\n**************\n");

        int k = 0;
        for (var person: people) {
            if(person.getClass().getName().equals("Teacher")){
                k++;
            }
        }

        Teacher[] teachers = new Teacher[k];
        int j = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getClass().getName().equals("Teacher")){
                teachers[j] = (Teacher) people[i];
                j++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i].experience < min){
               min = teachers[i].experience;
            }
        }
        for (var teacher: teachers) {
            System.out.println(teacher);
        }
        for (var teacher: teachers) {
            if (teacher.experience == min){
                System.out.println("\nMin experience: " + teacher);
            }
        }
        System.out.println();
        int k2 = 0;
        for (var person: people) {
            if(person.getClass().getName().equals("Student")){
                k2++;
            }
        }

        Student[] students = new Student[k2];
        int jj = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getClass().getName().equals("Student")){
                students[jj] = (Student) people[i];
                jj++;
            }
        }
        double max = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].avgRate > max){
                max = students[i].avgRate;
            }
        }

        for (var student: students) {
            System.out.println(student);
        }
        for (var student: students) {
            if (student.avgRate == max){
                System.out.println("\nMax rate:\n" + student);
            }
        }
        for (var student: students) {
            if (student.avgRate == max) {
                continue;
            } else if (student.avgRate > (max - 5.0)){
                System.out.println(student);
            }

        }
    }
}