// Level 1: Base Class
class Student {
    int rollNo;
    String name;

    void setStudent(int r, String n) {
        rollNo = r;
        name = n;
    }
}

// Level 2: Derived from Student
class Marks extends Student {
    int m1, m2;

    void setMarks(int mark1, int mark2) {
        m1 = mark1;
        m2 = mark2;
    }
}

// Level 3: Derived from Marks
class Result extends Marks {
    void display() {
        int total = m1 + m2;
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
    }
}

public class exp5 {
    public static void main(String[] args) {
        Result r = new Result();
        r.setStudent(12, "Sagar");
        r.setMarks(88, 92);
        r.display();
    }
}
