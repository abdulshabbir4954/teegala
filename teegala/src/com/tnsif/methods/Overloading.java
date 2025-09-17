package com.tnsif.methods;

class Overloading {

    void display(int a, double b) {
        System.out.println("Method with int and double parameters: " + a + ", " + b);
    }

    void display(double a, int b) {
        System.out.println("Method with double and int parameters: " + a + ", " + b);
    }

    void display(String s, int a) {
        System.out.println("Method with String and int parameters: " + s + ", " + a);
    }

    void display(int a, String s) {
        System.out.println("Method with int and String parameters: " + a + ", " + s);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.display(10, 20.5);
        obj.display(15.5, 20);
        obj.display("Hello", 100);
        obj.display(200, "World");
    }
}
