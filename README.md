import java.sql.*;

public class exp04 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "your_password"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT 10 + 20");

            if (rs.next()) {
                System.out.println("Result: " + rs.getInt(1));
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

# Java & Web Practical Exam Syllabus (SE Div A)

A complete, clean, paper-exam-ready collection of all 15 practical experiments.

---

## Index of Experiments

| # | File | Aim / Description |
| :-: | :--- | :--- |
| **01** | [`exp01.java`](./exp01.java) | Constructor overloading to calculate area of a rectangle |
| **02** | [`exp02.java`](./exp02.java) | Display employee details using Scanner class |
| **03** | [`exp03.java`](./exp03.java) | Implement Interface using `extends` keyword (Marks of 3 subjects) |
| **04** | [`exp04.java`](./exp04.java) & [`exp04.sql`](./exp04.sql) | Connect to a database using JDBC (Java + SQL) |
| **05** | [`exp05.java`](./exp05.java) | Demonstration of Multilevel Inheritance for a student record |
| **06** | [`exp06.java`](./exp06.java) | Exception Handling to demonstrate `ArithmeticException` (division by zero) |
| **07** | [`exp07.java`](./exp07.java) | Abstract Classes and Interfaces using Shape Area Calculator |
| **08** | [`exp08.java`](./exp08.java) | Static variables and static methods vs instance members |
| **09** | [`exp09.html`](./exp09.html) | HTML program using Table, Paragraph, Font, Heading, and Link tags |
| **10** | [`exp10.html`](./exp10.html) | HTML with CSS specifications (Company name styling, Comic Sans MS) |
| **11** | [`exp11.html`](./exp11.html) | HTML5 form with CSS (Name, Age, Email, Submit button) |
| **12** | [`exp12.html`](./exp12.html) | JavaScript to change paragraph content on button click |
| **13** | [`exp13.html`](./exp13.html) | JavaScript form validation (Name, Password, Email) |
| **14** | [`exp14.html`](./exp14.html) | Personal profile webpage using HTML, CSS, and JavaScript |
| **15** | [`exp15.java`](./exp15.java) | Method Overriding and Polymorphism using a Banking Application |

---

### Complete Study Guide
For all programs with their code, explanations, and outputs in a single page, check out **[ALL_EXPERIMENTS.md](./ALL_EXPERIMENTS.md)**.
