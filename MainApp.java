import college.student.student;
import college.faculty.Faculty;

public class MainApp {

    public static void main(String[] args) {

        student s = new student();
        s.displayStudent();

        Faculty f = new Faculty();
        f.displayFaculty();

    }
}

