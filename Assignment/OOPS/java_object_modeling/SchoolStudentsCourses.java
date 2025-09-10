import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Green School");
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Meena");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.enroll(c1);
        s2.enroll(c1);
        s2.enroll(c2);
        c1.showStudents();
        c2.showStudents();
    }
}
