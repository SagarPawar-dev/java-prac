class CollegeStudent {
    int rollNo;                 // Instance variable
    String name;               // Instance variable
    static String college = "ABC Institute"; // Static variable (shared)

    CollegeStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Instance method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }
}

public class exp8 {
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent(1, "Sagar");
        CollegeStudent s2 = new CollegeStudent(2, "Amit");

        System.out.println("--- Before Changing Static Variable ---");
        s1.display();
        s2.display();

        // Calling static method using Class Name (no object needed)
        CollegeStudent.changeCollege("XYZ University");

        System.out.println("\n--- After Changing Static Variable ---");
        s1.display();
        s2.display();
    }
}
