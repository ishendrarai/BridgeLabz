import java.util.*;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() { return marks; }
    public String getName() { return name; }
}

class Student {
    private String name;
    private int rollNo;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() { return name; }
}

class GradeCalculator {
    public String calculateGrade(Student s) {
        int total = 0;
        for (Subject sub : s.getSubjects()) total += sub.getMarks();
        int avg = total / s.getSubjects().size();
        if (avg >= 90) return "A";
        if (avg >= 75) return "B";
        if (avg >= 50) return "C";
        return "D";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        Student john = new Student("John", 101);
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator gc = new GradeCalculator();
        System.out.println("Student: " + john.getName());
        for (Subject sub : john.getSubjects())
            System.out.println(sub.getName() + ": " + sub.getMarks());
        System.out.println("Grade: " + gc.calculateGrade(john));
    }
}
