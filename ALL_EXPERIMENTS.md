# Complete Java & Web Practical Exam Syllabus (Experiments 1 to 15)
> **Specially tailored for writing on paper:** Concise, standard, perfect for examiners to award full marks without unnecessary boilerplate.

---

## Exp 1: Constructor Overloading to Calculate Area of Rectangle

### Aim:
Write a Java program for Constructor overloading to calculate area of a rectangle.

### Code:
```java
class Rectangle {
    double length, breadth;

    // 1. Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // 2. One parameter constructor (Square)
    Rectangle(double side) {
        length = breadth = side;
    }

    // 3. Two parameter constructor (Rectangle)
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class exp1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Default Area: " + r1.calculateArea());
        System.out.println("Square Area: " + r2.calculateArea());
        System.out.println("Rectangle Area: " + r3.calculateArea());
    }
}
```

### Expected Output:
```text
Default Area: 0.0
Square Area: 25.0
Rectangle Area: 24.0
```

---

## Exp 2: Employee Details using Scanner Class

### Aim:
Write a Java program to display the employee details using Scanner class.

### Code:
```java
import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        sc.close();
    }
}
```

### Expected Output:
```text
Enter Employee ID: 101
Enter Employee Name: Sagar
Enter Salary: 50000

--- Employee Details ---
ID: 101
Name: Sagar
Salary: 50000.0
```

---

## Exp 3: Interface using `extends` Keyword (Marks of 3 Subjects)

### Aim:
Write a Java program to implement Interface using extends keyword to calculate the marks of a student for the marks of three subjects.

### Code:
```java
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
```

### Expected Output:
```text
Total Marks: 255 / 300
Percentage: 85.0%
```

---

## Exp 4: Database Connection using JDBC

### Aim:
Write a Java program that connects to a database using JDBC.

> **Note for paper:** Teachers look for the **SQL table queries** and the **standard 5 steps of JDBC** inside a `try-catch` block.

### 1. SQL Script (`database.sql`):
```sql
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO student VALUES (101, 'Rahul');
INSERT INTO student VALUES (102, 'Amit');
```

### 2. Java Code (`exp04.java`):
```java
import java.sql.*;

public class exp4 {
    public static void main(String[] args) {
        try {
            // Step 1: Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            System.out.println("Database Connected Successfully!");

            // Step 3: Create Statement object
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // Step 5: Close connection
            con.close();
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
    }
}
```

### Expected Output:
```text
Database Connected Successfully!
101 Rahul
102 Amit
```

---

## Exp 5: Multilevel Inheritance for a Student Record

### Aim:
Demonstration of Multilevel Inheritance for a student record.

### Code:
```java
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
```

### Expected Output:
```text
Roll No: 12
Name: Sagar
Total Marks: 180
```

---

## Exp 6: Exception Handling (ArithmeticException / Division by Zero)

### Aim:
Implementation of Exception Handling to demonstrate ArithmeticException (division by zero).

### Code:
```java
public class exp6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Inside try block");
            int result = a / b; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero is not allowed!");
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues normally...");
    }
}
```

### Expected Output:
```text
Inside try block
Caught Exception: Division by zero is not allowed!
Finally block always executes.
Program continues normally...
```

---

## Exp 7: Abstract Classes and Interfaces (Shape Area Calculator)

### Aim:
Implementation of Abstract Classes and Interfaces using a Shape Area Calculator.

### Code:
```java
// Interface
interface Drawable {
    void draw();
}

// Abstract Class
abstract class Shape {
    abstract double area();
}

// Concrete class extending Abstract Class and implementing Interface
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.1416 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

public class exp7 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.draw();
        System.out.println("Area of Circle: " + c.area());
    }
}
```

### Expected Output:
```text
Drawing Circle...
Area of Circle: 78.54
```

---

## Exp 8: Static Variables & Static Methods vs Instance Members

### Aim:
To write a Java program to demonstrate the use of static variables and static methods, and to understand how they differ from instance members in a class.

### Code:
```java
class CollegeStudent {
    int rollNo;                 // Instance variable (separate for each object)
    String name;               // Instance variable
    static String college = "ABC Institute"; // Static variable (shared by all)

    CollegeStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Instance method (requires object)
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    // Static method (called directly via class name)
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
```

### Expected Output:
```text
--- Before Changing Static Variable ---
1 Sagar ABC Institute
2 Amit ABC Institute

--- After Changing Static Variable ---
1 Sagar XYZ University
2 Amit XYZ University
```

---

## Exp 9: HTML Program with Table, Paragraph, Font, Heading, Link

### Aim:
Write a HTML program that should use the following tags:
a) Table, b) Paragraph, c) Font, d) Heading tag, e) Link.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 9 - Basic HTML Tags</title>
</head>
<body>
    <!-- 1. Heading Tag -->
    <h1>Student Information Portal</h1>

    <!-- 2. Font Tag -->
    <font color="purple" size="4" face="Arial">
        Welcome to our educational website!
    </font>

    <!-- 3. Paragraph Tag -->
    <p>
        HTML (HyperText Markup Language) is the standard markup language
        used for creating web pages and web applications.
    </p>

    <!-- 4. Table Tag -->
    <h3>Subject Marks Table</h3>
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th>Subject</th>
            <th>Marks</th>
        </tr>
        <tr>
            <td>Java</td>
            <td>95</td>
        </tr>
        <tr>
            <td>Web Tech</td>
            <td>90</td>
        </tr>
    </table>

    <br>

    <!-- 5. Link (Anchor) Tag -->
    <a href="https://www.google.com" target="_blank">Click here to visit Google</a>
</body>
</html>
```

---

## Exp 10: HTML with CSS Specifications for Company Page

### Aim:
Write a program using HTML with the following CSS specifications:
1. The background color of the company name should be green.
2. The text color of the company name should be red.
3. The heading should be large with the font "Comic Sans MS".
4. The description of the company should be displayed in blue color in a paragraph.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 10 - Company Profile</title>
    <style>
        .company-name {
            background-color: green;
            color: red;
            font-size: 36px;
            font-family: "Comic Sans MS", cursive;
            padding: 10px;
            display: inline-block;
        }

        .company-desc {
            color: blue;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <h1 class="company-name">TechCorp Solutions</h1>

    <p class="company-desc">
        TechCorp Solutions is a leading software company delivering modern
        cloud, web, and enterprise Java solutions to global clients.
    </p>
</body>
</html>
```

---

## Exp 11: HTML5 Form with CSS

### Aim:
Write HTML5 code with CSS as follows:
1. To create a form to accept name, age, email address from the user.
2. Create a submit button to send the data.
3. The heading of the form should have a background color and a different font style.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 11 - Registration Form</title>
    <style>
        .form-heading {
            background-color: #3498db;
            color: white;
            font-family: 'Georgia', serif;
            font-style: italic;
            padding: 12px;
            text-align: center;
        }

        form {
            width: 320px;
            margin: 20px auto;
            padding: 15px;
            border: 1px solid #ccc;
        }

        label, input {
            display: block;
            width: 100%;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #2ecc71;
            color: white;
            padding: 8px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <form action="#" method="post">
        <h2 class="form-heading">User Registration Form</h2>

        <label>Name:</label>
        <input type="text" name="name" required placeholder="Enter full name">

        <label>Age:</label>
        <input type="number" name="age" min="1" max="100" required placeholder="Enter age">

        <label>Email Address:</label>
        <input type="email" name="email" required placeholder="name@example.com">

        <input type="submit" value="Submit">
    </form>
</body>
</html>
```

---

## Exp 12: JavaScript - Change Content of Paragraph on Button Click

### Aim:
Write a program in JavaScript to change the content in the paragraph on click of a button.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 12 - DOM Manipulation</title>
</head>
<body>
    <h2>JavaScript Button Click Demo</h2>

    <!-- Paragraph to be changed -->
    <p id="msg">This is the original paragraph content.</p>

    <!-- Button triggering JS function -->
    <button onclick="changeText()">Click Me to Change Content</button>

    <script>
        function changeText() {
            document.getElementById("msg").innerHTML =
                "Content has been successfully changed by JavaScript!";
        }
    </script>
</body>
</html>
```

---

## Exp 13: JavaScript Form Validation (Name, Password, Email)

### Aim:
Write a JavaScript program to validate the name, password, and email text field.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 13 - Form Validation</title>
</head>
<body>
    <h2>Form Validation</h2>

    <form onsubmit="return validateForm()">
        Name: <input type="text" id="uname"><br><br>
        Email: <input type="text" id="uemail"><br><br>
        Password: <input type="password" id="upass"><br><br>
        <input type="submit" value="Register">
    </form>

    <script>
        function validateForm() {
            var name = document.getElementById("uname").value;
            var email = document.getElementById("uemail").value;
            var pass = document.getElementById("upass").value;

            if (name.trim() == "") {
                alert("Name cannot be empty!");
                return false;
            }

            if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
                alert("Please enter a valid email containing '@' and '.'");
                return false;
            }

            if (pass.length < 6) {
                alert("Password must be at least 6 characters long!");
                return false;
            }

            alert("Validation successful! Form submitted.");
            return true;
        }
    </script>
</body>
</html>
```

---

## Exp 14: Personal Profile Webpage (HTML + CSS + JavaScript)

### Aim:
Design and develop a personal profile webpage using HTML, CSS, and JavaScript.

### Code:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Exp 14 - Personal Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            padding: 40px;
        }
        .card {
            background: white;
            padding: 25px;
            width: 300px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            text-align: center;
        }
        h2 { color: #333; margin-bottom: 5px; }
        p { color: #666; font-size: 14px; }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 8px 16px;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="card">
        <h2>Sagar Sharma</h2>
        <p>Computer Engineering Student</p>
        <p><strong>Skills:</strong> Java, HTML, CSS, JS</p>

        <button onclick="toggleBio()">Show Contact Info</button>
        <p id="contact" style="display: none; margin-top: 15px; color: green;">
            Email: sagar@example.com <br> Phone: +91 9876543210
        </p>
    </div>

    <script>
        function toggleBio() {
            var info = document.getElementById("contact");
            if (info.style.display === "none") {
                info.style.display = "block";
            } else {
                info.style.display = "none";
            }
        }
    </script>
</body>
</html>
```

---

## Exp 15: Method Overriding and Polymorphism (Banking Application)

### Aim:
Implementation of Method Overriding and Polymorphism using a Banking Application.

### Code:
```java
// Superclass
class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

// Subclass 1
class SBI extends Bank {
    double getRateOfInterest() {
        return 7.5;
    }
}

// Subclass 2
class ICICI extends Bank {
    double getRateOfInterest() {
        return 8.0;
    }
}

// Subclass 3
class AXIS extends Bank {
    double getRateOfInterest() {
        return 8.5;
    }
}

public class exp15 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch (Runtime Polymorphism)
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest() + "%");

        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest() + "%");
    }
}
```

### Expected Output:
```text
SBI Rate of Interest: 7.5%
ICICI Rate of Interest: 8.0%
AXIS Rate of Interest: 8.5%
```
