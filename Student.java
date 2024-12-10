import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String dob;
    String course;
    int courseStartYear;
    int courseEndYear;
    List<Subject> subjects;

    public Student(int id, String name, int age, String gender, String dob, String course, int courseStartYear, int courseEndYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
        this.course = course;
        this.courseStartYear = courseStartYear;
        this.courseEndYear = courseEndYear;
        this.subjects = new ArrayList<>();  //arraylist for subject which stores student subject and marks
    }

    public void addSubject(Subject subject) { //we are adding subject and marks to this method 
        this.subjects.add(subject);
    }

    public void display() {  //display method for student 
        System.out.printf("%-5d %-15s %-5d %-10s %-15s %-15s %-20d %-15d", id, name, age, gender, dob, course, courseStartYear, courseEndYear);
        for (Subject subject : subjects) {
            System.out.printf(" %-15s", subject.name + ": " + subject.marks); //and here to print subjects with marks
        }
        System.out.println();
    }
}
