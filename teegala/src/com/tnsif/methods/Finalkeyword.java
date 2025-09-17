package com.tnsif.methods;

//Final class (cannot be inherited)
final class FinalClass {
 void show() {
     System.out.println("This is a final class.");
 }
}

//Normal class
class Parent {
 // final variable (constant)
 final int MAX_MARKS = 100;

 // final method (cannot be overridden)
 final void display() {
     System.out.println("This is a final method in Parent class.");
 }
}

//Child class extends Parent
class Child extends Parent {
 // ❌ If we try to override display(), it gives compile-time error
 /*
 void display() {
     System.out.println("Trying to override..."); // Not allowed
 }
 */

 void showMarks() {
     System.out.println("Maximum marks: " + MAX_MARKS);
     // ❌ MAX_MARKS = 200; // Not allowed, since it's final
 }
}

public class Finalkeyword {
 public static void main(String[] args) {
     // Final variable example
     Child c = new Child();
     c.display();      // Calls Parent's final method
     c.showMarks();

     // Final class example
     FinalClass f = new FinalClass();
     f.show();

 }
}
