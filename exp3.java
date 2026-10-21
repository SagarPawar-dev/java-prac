// Parent Interface
interface Exam {
    void getMarks(int m1, int m2, int m3);
}

// Child Interface extending parent interface
interface Result extends Exam {
    void displayResult();
}

// Class implementing child interface
class Student implements Result {
    int total;
    double percentage;

    public void getMarks(int m1, int m2, int m3) {
        total = m1 + m2 + m3;
        percentage = total / 3.0;
    }

    public void displayResult() {
        System.out.println("Total Marks: " + total + " / 300");
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class exp3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.getMarks(85, 90, 80);
        s.displayResult();
    }
}
