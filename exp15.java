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
