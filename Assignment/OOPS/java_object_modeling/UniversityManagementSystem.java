import java.util.*;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
    }

    public void enrollStudent(Student s) {
        students.add(s);
    }

    public void showCourse() {
        System.out.println("Course: " + name);
        if (professor != null) System.out.println("Professor: " + professor.getName());
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Professor p1 = new Professor("Dr. Rao");
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Meena");
        c1.assignProfessor(p1);
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.showCourse();
    }
}
