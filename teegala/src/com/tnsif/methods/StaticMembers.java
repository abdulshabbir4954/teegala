package com.tnsif.methods;

class Learner {
    int id;                   // Instance variable
    String name;              // Instance variable
    static String college;    // Static variable (shared by all learners)

    // Static block (executes only once when class is loaded)
    static {
        college = "ABC College";
        System.out.println("Static block executed, college set to: " + college);
    }

    Learner(int i, String n) {
        id = i;
        name = n;
    }
    // Static method (can access static variables only)
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        // Static block runs before main()

        Learner l1 = new Learner(1, "Alice");
        Learner l2 = new Learner(2, "Bob");

        l1.display();
        l2.display();

        // Change college using static method
        Learner.changeCollege("XYZ University");

        l1.display();
        l2.display();
    }
}
